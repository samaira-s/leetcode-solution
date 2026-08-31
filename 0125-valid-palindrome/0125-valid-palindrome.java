class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int first=0;
        int last =s.length()-1;
       while(first<=last){
        char currfir= s.charAt(first);
        char currlas=s.charAt(last);
        if(!Character.isLetterOrDigit(currfir)){
            first++;
        }
        else if(!Character.isLetterOrDigit(currlas)){
            last--;
        }
        else{
            if(Character.toLowerCase(currlas)!=Character.toLowerCase(currfir)){
            return false;
            }
            first++;
            last--;
        }
       }
       return true;
    }
}