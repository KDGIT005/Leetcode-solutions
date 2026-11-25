class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n == 0) return 0;
        int ans = 1;
        int cnt = 1;
        for(int i = 1; i<n; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] - nums[i-1] == 1){
                cnt++;
            }else{
                cnt = 1;
            }
            ans = Math.max(ans , cnt);
        }
        return ans;
    }
}