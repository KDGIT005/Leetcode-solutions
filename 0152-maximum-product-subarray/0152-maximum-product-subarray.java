class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int pro = 1;
            for(int j = i; j<n; j++){
                pro *= nums[j];
            ans = Math.max(ans , pro);
            }
        }
        return ans;
    }
}