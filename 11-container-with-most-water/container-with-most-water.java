class Solution {
    public int maxArea(int[] height) {
        int left = 0;
		int right = height.length - 1;
		int max = 0;
		
		while (left < right) {
			int diff = right - left;
			int area = 0;
			
			if (height[left] < height[right]) {
				area = diff * height[left];
				left++;
			} else {
				area = diff * height[right];
				right--;
			}
			max = Math.max(max, area);
		}
		return max;
    }
}