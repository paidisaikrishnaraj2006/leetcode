class Solution {
    public boolean canReach(int[] start, int[] target) {
        int sum1=0;
        for(int num:start){
            sum1+=num;
        }
        int sum2=0;
        for(int num:target){
            sum2+=num;
        }
        int ans=sum1+sum2;
        if(ans%2!=0){
            return false;
        }else{
            return true;
        }

    }
}