class Solution {
    public int removeDuplicates(int[] nums) {

        int read =  1; 
        int write = 1;
        int len = nums.length;

        if(len ==0){
            return 0;
        }
        if(len ==1){
            return 1;

        }

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