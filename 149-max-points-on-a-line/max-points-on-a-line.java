class Solution {
    public static int maxPoints(int[][] points) {
		int maxCount = 0;
		int rowLen = points.length;

    if (rowLen<=2){
			return rowLen;
		}
		
		for (int i = 0; i < rowLen - 1; i++) {
			HashMap<Double, Integer> map = new HashMap<>();
			for (int j = i + 1; j < rowLen; j++) {
				int y = points[j][1] - points[i][1];
				int x = points[j][0] - points[i][0];
				
				double slope;
				// Vertical line
				if (x == 0) {
					slope = Double.POSITIVE_INFINITY;
				}
				// Horizontal line
				else if (y == 0) {
					slope = 0.0;
				} else {
					slope = (double) y / x;
				}
				int count = map.getOrDefault(slope, 0) + 1;
				map.put(slope, count);
				maxCount = Math.max(maxCount, count + 1);
			}
		}
		
		return maxCount;
	}
}