class Solution {
    public int arraySign(int[] nums) {
        int prod=1;
        for(int num:nums){
            if(num==0){
                return 0;
            }
            if(num<0){
            prod*=-1;
        } 
        }
        return prod;
    }
}