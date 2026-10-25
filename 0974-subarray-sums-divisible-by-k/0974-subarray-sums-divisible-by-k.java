
import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int cnt = 0;
        for (int x : nums) {
            sum += x;
            int rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            cnt += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return cnt;
    }
}
