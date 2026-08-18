class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int max = 0;

        for (int r = 0; r < n; r++) {

            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.getOrDefault(0, 0) > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}