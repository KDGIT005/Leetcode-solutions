class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i] , i);
            }
        }
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
}