class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double temp=sum;
       
        for(int i=k;i<n;i++){
            temp+=nums[i]-nums[i-k];
            if(temp>sum){
            sum=temp;
        }
        }
             
        
        
        return sum/k;
    }
}