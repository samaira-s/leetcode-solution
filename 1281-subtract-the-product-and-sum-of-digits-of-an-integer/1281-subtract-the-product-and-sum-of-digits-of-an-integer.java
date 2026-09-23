class Solution {
    public int subtractProductAndSum(int n) {
     int prod=1;
     int d=0;
     int sum=0;
     int k=n;
     while(k!=0){
        int c=k%10;
        prod*=c;
        k/=10;
     }  
     k=n;
     while(k!=0){
        int c=k%10;
        sum+=c;
        k/=10;
     }  
     d=prod-sum; 
     return d;
    }
}