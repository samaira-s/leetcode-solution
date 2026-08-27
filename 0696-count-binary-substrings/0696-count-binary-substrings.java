class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0;
        int zero=1;
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            if (s.charAt(i)==s.charAt(i+1)){
                zero++;
            }
            else{
               prev=zero;
               zero=1;
            }
            if(prev>=zero)
            {res++;}}
       
            return res;
        
        }
    }
