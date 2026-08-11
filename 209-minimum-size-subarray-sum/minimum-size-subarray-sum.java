class Solution {
  public int minSubArrayLen(int target, int[] nums) {
    int min = Integer.MAX_VALUE;
		int left = 0;
		int sum = 0;
		int right = 0;
		int len = nums.length;
		while (right < len) {
			sum = sum + nums[right];
			while (sum >= target) {
				min = Math.min(min, (right - left) + 1);
				sum = sum - nums[left];
				left++;
			}
			right++;
		}
		if (min == Integer.MAX_VALUE) {
			return 0;
		}
		return min;

  }
}