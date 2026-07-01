class Solution {
    public int removeDuplicates(int[] nums) {

        int read =  1; 
        int write = 1;
        int len = nums.length;

        while(read<len){

                if(nums[read]!=nums[write-1]){
                    nums[write]=nums[read];
                    write++;
                }
                read++;


        }
        return write;
        

        
    }
}