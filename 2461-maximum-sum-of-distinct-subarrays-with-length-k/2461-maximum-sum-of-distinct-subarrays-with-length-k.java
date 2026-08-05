class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       int n = nums.length;
        long max = 0;
        long sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<k; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
            sum += nums[i];
        }
        if(map.size() == k){
            max = sum;
        }
        for(int i = k; i<n; i++){
        sum = sum + nums[i] - nums[i-k];
        if(map.get(nums[i-k])==1){
            map.remove(nums[i-k]);
        }else{
            map.put(nums[i-k] , map.get(nums[i-k])-1);
        }
         map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        if(map.size() == k){
            max = Math.max(max ,  sum);
        }
        }
        return max; 
    }
}