class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l=new ArrayList<>();
       int count=0;
       int less=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
           count++;
        }
        else if(nums[i]<target){
            less++;
        }
    }
    for(int i=0;i<count;i++){
        l.add(less++);
    }
return l;
    }
    }
