class Solution {
    public List<String> summaryRanges(int[] nums) {
     List<String> list = new ArrayList<>();
		
		int i = 0;
		
		while (i < nums.length) {
			int start = nums[i];
			
			while (i < nums.length - 1 && nums[i] == nums[i + 1]-1) {
				i++;
			}
			
			int end = nums[i];
			if (start == end) {
				list.add(String.valueOf(start));
			} else {
				list.add(String.valueOf(start + "->" + end));
			}
			i++;
		}
		
		return list;   
    }
}