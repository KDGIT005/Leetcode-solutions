class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int cnt = Integer.MAX_VALUE;
        int sum = 0;
        for(int r = 0; r<nums.length; r++){
            sum += nums[r];
            while(sum >= target){
                cnt = Math.min(cnt , r-l+1);
                sum = sum - nums[l];
                l++;
            }
        }
        return cnt == Integer.MAX_VALUE ? 0 : cnt;
    }
}