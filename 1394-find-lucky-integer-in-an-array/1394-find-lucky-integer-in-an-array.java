class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        int t=-1;
        for(int num:arr){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int key:m.keySet()){
            if(m.get(key)==key){
                t=key;
           
            }
            
                
            
        }
        return t;
    }
}