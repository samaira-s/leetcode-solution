class Solution {
    public boolean uniformArray(int[] nums1) {
        Stack<Integer> even=new Stack<>();
        Stack<Integer> odd=new Stack<>();
        int[] arr=new int[nums1.length];
        for(int k:nums1){
            if(k%2==0){
            even.push(k);}
            else{
                odd.push(k);
            }
        }
        if(even.size()>=nums1.length || even.size()+odd.size()*even.size()>=nums1.length || odd.size()>=nums1.length  ){
            return true;
        }
        else{return false;}

    }
}