class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<=Math.pow(n,0.5)+1;i++){
            if(Math.pow(2,i)==n){
                return true;
            }
        }
        return false;
    }
}