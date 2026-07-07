class Solution {
    public int lengthOfLongestSubstring(String s) {
         Set<Character> m=new HashSet<Character>();
        int ml=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(!m.contains(s.charAt(i))){
                m.add(s.charAt(i));
                ml=Math.max(ml,i-l+1);
            }
            else{
                while(m.contains(s.charAt(i))){
                    m.remove(s.charAt(l));
                    l++;
                }
                m.add(s.charAt(i));
            }

        }
        return ml;
    }}