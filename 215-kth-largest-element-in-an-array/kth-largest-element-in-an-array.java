class Solution {
      public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for (int i = 0; i < k; i++) {
			queue.add(nums[i]);
		}
		
		for (int i = k; i < nums.length; i++) {
			
			int min = queue.peek();
			if (nums[i] <= min) {
				continue;
			}
			queue.poll();
			queue.add(nums[i]);
			
		}
		return queue.peek(); 
      }
}