class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        if(k>=n) return n;
        HashMap<Integer , Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int max = 0;
        while(r<n){
            map.put(nums[r] ,  map.getOrDefault(nums[r] , 0)+1);
            while(map.getOrDefault(0,0) > k){
                map.put(nums[l], map.get(nums[l]) -1  );
                l++;
            }
            max = Math.max(max , r-l+1);
            
            r++;
        }
        return max;
    }
}