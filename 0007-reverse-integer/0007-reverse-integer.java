class Solution {
    public int reverse(int x) {
       
    
        int c=x;
        int d=0;
        long sum=0;
        while(c!=0){
             d=c%10;
             sum=sum*10+d;
             c/=10;
        }
        
     
    
         if( sum>(Math.pow(2,31)-1)|| sum<Math.pow(-2,31)){
            return 0;
         }
         
    
         else{
            return (int)sum;
         }
    }
}