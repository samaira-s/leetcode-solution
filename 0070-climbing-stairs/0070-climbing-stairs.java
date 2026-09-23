class Solution {
    public int climbStairs(int n) {
     Map<Integer,Integer> memo=new HashMap<>();
     return climb(n,memo);
    }
    int climb(int k,Map<Integer,Integer> memo){
        if (k==1){
            return 1;
        }
        if(k==2){
            return 2;
        }
        if(!memo.containsKey(k)){
            memo.put(k,climb(k-1,memo)+climb(k-2,memo));
        }
        return memo.get(k);
    }
}