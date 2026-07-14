class Solution {
    public int jump(int[] nums) {

        int current = 0;
        int jumps = 0;
        int longest = 0;

        for (int i = 0; i < nums.length-1; i++) {

            longest = Math.max(longest, i + nums[i]);

            if (i == current) {
                jumps++;
                current = longest;
            }
        }

        return jumps;
        
    }
}