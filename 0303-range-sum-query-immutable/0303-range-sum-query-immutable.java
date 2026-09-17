class NumArray {
private int[]arr;
    public NumArray(int[] nums) {
       arr=new int[nums.length+1];
       int i=1;
       arr[0]=0;
       for(int n:nums){
            arr[i]=n+arr[i-1];
            i++;
       }

    
    }
    public int sumRange(int left, int right) {

       
        return arr[right+1]-arr[left];
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */