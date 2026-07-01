class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length<=2){
            return nums.length;
        }

        int read=2;
        int write=2;
        
        while(read < nums.length){
            
            if(nums[read]!=nums[write-2]){
                nums[write]=nums[read];
                write++;
            }
            read++;
        }
        return write;
    }
}