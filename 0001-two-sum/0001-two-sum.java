class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        int[] a=new int[2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(m.containsKey(comp) && m.get(comp)!=i){
                a[0]=i;
                a[1]=m.get(comp);
                 
            }
        }
       return a;
           }
        }