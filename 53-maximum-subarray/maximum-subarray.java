class Solution {
  public int maxSubArray(int[] nums) {
    int maxSum = nums[0];
		int currentSum = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			int current = nums[i];
			currentSum = currentSum + nums[i];
			currentSum = Math.max(current, currentSum);
			maxSum = Math.max(currentSum, maxSum);
		}
		
		return maxSum;
  }
}