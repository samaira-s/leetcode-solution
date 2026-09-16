class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num!=0){
            int c=num%10;
            sum+=c;
            num=num/10;
        }
        while (sum>=10){
            int n=sum;
            sum=0;
        while(n!=0){
            
            int c=n%10;
            sum+=c;
            n=n/10;
        }
    }
    return sum;
}
}