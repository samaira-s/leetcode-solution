
class Solution {
    public String intToRoman(int num) {
        StringBuilder sb =new StringBuilder();
        int t=num/1000;
        for(int i=0;i<t;i++){
            sb.append("M");
        }
        int d=(num/100)%10;
        if(3>=d && d>=0){
          for(int i=0;i<d;i++){
            sb.append("C");
          }
        }
        else if(d==4){
            sb.append("CD");
        }
        else if(9>d && d>=5){
            sb.append("D");
            for(int i=0;i<(d-5);i++){
                sb.append("C");
            }
        }
        else {
            sb.append("CM");
        }
        int k=(num/10)%10;
     if(3>=k && k>=0){
          for(int i=0;i<k;i++){
            sb.append("X");
          }
        }
        else if(k==4){
            sb.append("XL");
        }
        else if(9>k && k>=5){
            sb.append("L");
            for(int i=0;i<(k-5);i++){
                sb.append("X");
            }
        }
        else {
            sb.append("XC");
        }
        t=num%10;
        if(3>=t && t>=0){
          for(int i=0;i<t;i++){
            sb.append("I");
          }
        }
        else if(t==4){
            sb.append("IV");
        }
        else if(9>t && t>=5){
            sb.append("V");
            for(int i=0;i<(t-5);i++){
                sb.append("I");
            }
        }
        else {
            sb.append("IX");
        }  
    return sb.toString(); 
    }
}