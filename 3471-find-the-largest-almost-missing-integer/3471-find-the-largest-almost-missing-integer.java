class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        int[] count = new int[51];

        for (int i = 0; i <= n - k; i++) {

            HashSet<Integer> set = new HashSet<>();


            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }


            for (int num : set) {
                count[num]++;
            }
        }

        int ans = -1;

        for (int num = 0; num <= 50; num++) {
            if (count[num] == 1) {
                ans = num;
            }
        }

        return ans;
    }
}