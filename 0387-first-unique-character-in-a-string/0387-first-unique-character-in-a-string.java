class Solution {
    public int firstUniqChar(String s) {
       int[] al=new int[26];
       int flag=0;
       int index=s.length();
       for(char c:s.toCharArray()){
       al[c-'a']++; 
    }
    for(int i=(al.length-1);i>=0;i--){
        if(al[i]==1){
            flag=1;
           int temp= s.indexOf(i+'a');
            if(temp<index){
                index=temp;
            }
            
        }
    }
    if (flag==1){
    return index;}
    else{
        return -1;
    }
}
}