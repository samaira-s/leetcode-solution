class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] res =new int[n];
        int l=0;
        int r=n-1;
        for(int k:nums){
            if(k%2==0){
              res[l++]=k;  
            }
            else{
                res[r--]=k;
            }
        }
        return res;
    }
}