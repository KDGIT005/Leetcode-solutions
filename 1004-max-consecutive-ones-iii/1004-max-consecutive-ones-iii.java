class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int zerocnt = 0;
        int max = 0;
        for(int r = 0; r<n; r++){
            if(nums[r] == 0){
                zerocnt++;
            }
            while(zerocnt > k){
                if(nums[l]==0){
                    zerocnt--;
                }
                l++;
            }
            max = Math.max(max , r-l +1);
        }
        return max;
    }
}