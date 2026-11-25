
class Solution {
    public int longestConsecutive(int[] nums) {

        // Step 1: Store all numbers in HashSet
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int ans = 0;

        // Step 2: Check every unique number
        for(int num : set) {

            // Step 3: Find starting point
            if(!set.contains(num - 1)) {

                int cnt = 1;
                int curr = num;

                // Step 4: Count consecutive numbers
                while(set.contains(curr + 1)) {
                    curr++;
                    cnt++;
                }

                // Step 5: Update maximum length
                ans = Math.max(ans, cnt);
            }
        }

        return ans;
    }
}
