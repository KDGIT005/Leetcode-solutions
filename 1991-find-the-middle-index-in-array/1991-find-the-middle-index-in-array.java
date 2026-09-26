class Solution {
    public int findMiddleIndex(int[] nums) {
        int l = 0;
        int n = nums.length;
        int totalsum = 0;
        for(int x : nums){
            totalsum += x;
        }
        int leftsum = 0;
        while(l < n){
            int rightsum = totalsum - leftsum - nums[l];
            if(leftsum == rightsum){
                return l;
            }
            leftsum += nums[l];
            l++;
        }
        return -1;
    }
}