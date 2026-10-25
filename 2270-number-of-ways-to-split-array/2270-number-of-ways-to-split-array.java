class Solution {
    public int waysToSplitArray(int[] nums) {
        long tsum = 0;
        for(int x : nums){
            tsum += x;
        }
        int cnt = 0;
        long left = 0;
        for(int i = 0; i<nums.length-1; i++){
            left += nums[i];
            long right = tsum - left;
            if(left >= right){
                cnt++;
            } 
        }
        return cnt;
    }
}