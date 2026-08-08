class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> li = new ArrayList<>();
    help(nums,0,li);
    return li;
    }
private void help(int[] nums ,int i,List<List<Integer>> li){
    
if(i==nums.length){
     List<Integer> lis = new ArrayList<>();
    for(int num:nums){
        lis.add(num);}
        li.add(lis);
        return;

    
}

for(int j=i;j<nums.length;j++){
    swap(nums,i,j);
    help(nums,i+1,li);
    swap(nums,i,j);
}
}

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}