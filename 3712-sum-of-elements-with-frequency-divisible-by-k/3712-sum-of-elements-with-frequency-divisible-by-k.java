class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=0;
        for(int num:map.keySet()){
            int freq=map.get(num);
            if(freq%k==0){
                res+=freq*num;
            }
        }
        return res;
    }
}