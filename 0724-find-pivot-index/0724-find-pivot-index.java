class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int tsum = 0;
        for(int i = 0; i<nums.length; i++){
            tsum += nums[i];
        }
        int left = 0; 
        for(int i = 0; i<n; i++){
            int right = tsum - left - nums[i];
            if(left == right){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}