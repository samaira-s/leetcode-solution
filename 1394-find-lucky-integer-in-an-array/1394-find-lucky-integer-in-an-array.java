class Solution {
    public int findLucky(int[] arr) {
        int t=-1;
        int[] num=new int [501];
        for(int i=0;i<arr.length;i++){
            num[arr[i]]++;
        }
       for(int i=1;i<501;i++){
        if(num[i]==i){
            t=i;
        }
       }
        return t;
    }
}