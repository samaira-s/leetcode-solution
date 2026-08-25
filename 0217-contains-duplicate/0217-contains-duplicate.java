class Solution {
    public boolean containsDuplicate(int[] nums) {
       int s=nums.length;
       boolean t=false;
       Map<Integer,Integer> m=new HashMap<>();
       for(int n:nums){
        m.put(n,m.getOrDefault(n,0)+1);
       } 
       for(int key:m.keySet()){
        if(m.get(key)>=2){
            t=true;
        }
       }
       return t;
    }
}