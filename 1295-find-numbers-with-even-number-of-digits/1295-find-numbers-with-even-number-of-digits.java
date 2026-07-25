class Solution {
    public int findNumbers(int[] nums) {
        int count=0;

        for(int num:nums){
            int digit=0;
            int n=num;

            while(n>0){
                digit++;
                n/=10;
            }
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}