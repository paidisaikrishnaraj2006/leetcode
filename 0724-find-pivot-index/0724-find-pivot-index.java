class Solution {
    public int pivotIndex(int[] nums) {
        int totsum=0;

        for(int i=0;i<nums.length;i++){
            totsum+=nums[i];
        }
        int leftsum=0;

        for(int i=0;i<nums.length;i++){
            int rightsum=totsum-leftsum-nums[i];

            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}