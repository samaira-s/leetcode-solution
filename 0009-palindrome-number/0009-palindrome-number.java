class Solution {
    public boolean isPalindrome(int x) {
        boolean flag=true;
        if(x<0){
            flag=false;
        }
        else{
            int c=0;
            int sum=0;
            int y=x;
            while(y>0){
                 c=y%10;
                 sum=sum*10+c;
                 y/=10;
            }
            if(x==sum){
               flag=true;;
            }
            else{flag=false;}

        }
        return flag;
    }
}