class Solution {
    private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;
        int n = nums.length;
        int l = 0;
        int ans = 0;
        int oddcnt = 0;
        for (int r = 0; r < n; r++) {
            if(nums[r]%2 != 0) oddcnt++;
            while (oddcnt > goal) {
                if(nums[l]%2 != 0) oddcnt--;
                l++;
            }
            ans += r - l + 1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
}