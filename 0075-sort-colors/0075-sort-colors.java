class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int m=0;
        int l=0;
        int r=n-1;
        while(m<=r){
            if(nums[m]==0){
                swap(nums,m,l);
                l++;
                m++;
            }
            else if(nums[m]==2){
                swap(nums,m,r);
                r--;
               
            }

            else{
                m++;
            }

        } 
    }
        void swap(int[] nums,int m ,int l){
            int temp=nums[m];
            nums[m]=nums[l];
            nums[l]=temp;
        
    }
}
