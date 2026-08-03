class Solution {
  public int findMinArrowShots(int[][] points) {
    int count = 1;
			if (points.length == 0) {
				return 0;
			}
		Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
			int start1 = points[0][0];
			int end1 = points[0][1];
			
			for (int i = 1; i < points.length; i++) {
			int start2 = points[i][0];
			int end2 = points[i][1];
			
			if (end1 >= start2) {
				start1 = Math.max(start1, start2);
				end1 = Math.min(end1, end2);
			} else {
				count++;
				start1 = start2;
				end1 = end2;
			}
		}
			return count;
  }
}