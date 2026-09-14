class Solution {
    public int pivotIndex(int[] nums) {
       int total=0;
       int lefts=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
         for(int i=0;i<nums.length;i++){
           if(lefts==total-lefts-nums[i]){
            return i;
           }
           lefts+=nums[i];
         }
        
      
            return -1;
        }
    }
