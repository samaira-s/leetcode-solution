class Solution {
    public char findTheDifference(String s, String m) {
        Map<Character,Integer> t=new HashMap<>();
        for (char c:m.toCharArray()){
            t.put(c,t.getOrDefault(c,0)+1);
        }
    for(char c:s.toCharArray()){
        t.put(c,t.get(c)-1);
        if(t.get(c)==0){
            t.remove(c);
        }
    }
    return (char)t.keySet().toArray()[0];
    }
}