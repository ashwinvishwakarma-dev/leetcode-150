class Solution {
    public int removeElement(int[] nums, int val) {
        int len= nums.length;
        int write = 0;
        int read  = 0;

        while(read<len){
            if(nums[read]!=val){
                nums[write]=nums[read];
                read++;
                write++;
            }else{
                read++;
            }
        }
     return write++;
    }
}