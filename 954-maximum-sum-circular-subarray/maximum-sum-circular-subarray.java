class Solution {
    public  int maxSubarraySumCircular(int[] nums) {
		int maxSum = kadaneMax(nums);
		int minSum = kadaneMin(nums);
		int totalSum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			totalSum = totalSum + nums[i];
		}
		
		if (maxSum < 0) {
			return maxSum;
		}
		
		int wrappingSum = totalSum - minSum;
		
		return Math.max(maxSum, wrappingSum);
	}
	
	private  int kadaneMax(int[] nums) {
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
	
	private  int kadaneMin(int[] nums) {
		int minSum = nums[0];
		int currentSum = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			int current = nums[i];
			currentSum = currentSum + nums[i];
			currentSum = Math.min(current, currentSum);
			minSum = Math.min(currentSum, minSum);
		}
		return minSum;
	}
}