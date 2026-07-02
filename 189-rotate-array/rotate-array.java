class Solution {
    public void rotate(int[] nums, int k) {

        int size =nums.length;

        k=k%size;

        // Rotate [7,6,5,4,3,2,1]
        reverse(nums,0,size-1); 
       
        // Rotate [5,6,7,4,3,2,1] it will rotate from (0 to kth element)
        reverse(nums,0,k-1);  

        // Rotate [5,6,7,1,2,3,4]
        reverse(nums,k,size-1); 
  
        
    }

    public void reverse(int[] nums,int left,int right){
            while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;

            left++;
            right--;
        }
    }
}