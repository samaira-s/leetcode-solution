class Solution {
    public int subtractProductAndSum(int n) {
     int prod=1;
     int sum=0;
     while(n!=0){
        int c=n%10;
        sum+=c;
        prod*=c;
        n/=10;
     }  
    
     return prod-sum; 
    }
}