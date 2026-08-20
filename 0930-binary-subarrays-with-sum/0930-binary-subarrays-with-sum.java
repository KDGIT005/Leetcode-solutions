class Solution {

    private int atMost(int[] nums, int k) {
        if (k < 0) return 0;

        int n = nums.length;
        int l = 0;
        int cnt = 0;
        int sum = 0;

        for (int r = 0; r < n; r++) {
            sum += nums[r];

            while (sum > k) {
                sum -= nums[l];
                l++;
            }

            cnt += r - l + 1;
        }

        return cnt;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
}