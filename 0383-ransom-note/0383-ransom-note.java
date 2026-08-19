class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      Map<Character,Integer> m=new HashMap<>();
       Map<Character,Integer> m2=new HashMap<>();
      boolean t=true;
      for(char c:ransomNote.toCharArray()){
        m.put(c,m.getOrDefault(c,0)+1);
      }  
       for(char c:magazine.toCharArray()){
        m2.put(c,m2.getOrDefault(c,0)+1);
      }  
      for(char key:m.keySet()){
        if(m.get(key)>m2.getOrDefault(key,0)){
            t=false;
            break;
        }
      }
return t;
    }
}