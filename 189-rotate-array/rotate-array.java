class Solution {
    public void rotate(int[] nums, int k) {

       
     
        int left = 0;
        int right = nums.length-1;
        int size =nums.length;
        k=k%size;


        while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;

            left++;
            right--;
        }
        left =0;
        right=k-1;
        while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;

            left++;
            right--;
        }
        left =k;
        right=nums.length-1;
        while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;

            left++;
            right--;
        }

        
        
    }
}