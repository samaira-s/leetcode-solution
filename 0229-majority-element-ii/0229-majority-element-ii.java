class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n=nums.length;
       List<Integer> l=new ArrayList<>();
    Map<Integer,Integer> m=new HashMap<>();
    for(int k:nums){
        m.put(k,m.getOrDefault(k,0)+1);
    }
    for(int key:m.keySet()){
        if(m.get(key)>(n/3)){
            l.add(key);
        }
    }
return l;
    }
}