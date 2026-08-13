class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int k=0;
        Map<Integer,Integer> m=new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        for(int key:m.keySet()){
            if(m.get(key)>len/2){
            k=key;
        }

    }
return k;
    }}