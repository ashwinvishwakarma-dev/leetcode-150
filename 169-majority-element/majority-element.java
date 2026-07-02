class Solution {
    public int majorityElement(int[] nums) {
     
        int size= (nums.length)/2;
        int element=0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
          int count = map.getOrDefault(nums[i],0);

        map.put(nums[i],(count+1));
          if((count+1)>size){
            element=nums[i];
          }

        }
        return element;

    }
}