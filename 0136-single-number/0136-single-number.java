class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        int k=0;
        Map<Integer,Integer> m=new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        for(int key:m.keySet()){
            if(m.get(key)==1){
            k=key;
        }
    }
    return k;
    }
}