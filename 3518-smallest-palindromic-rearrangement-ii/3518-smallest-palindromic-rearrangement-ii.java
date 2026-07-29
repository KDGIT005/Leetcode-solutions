class Solution {

    private static final long LIMIT = 1_000_000L;

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int[] half = new int[26];
        String mid = "";

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            if ((freq[i] & 1) == 1) {
                mid = String.valueOf((char) ('a' + i));
            }
        }

        if (countWays(half) < k) {
            return "";
        }

        int halfLen = s.length() / 2;
        StringBuilder left = new StringBuilder();

        for (int pos = 0; pos < halfLen; pos++) {
            for (int c = 0; c < 26; c++) {
                if (half[c] == 0) continue;

                half[c]--;

                long ways = countWays(half);

                if (ways >= k) {
                    left.append((char) ('a' + c));
                    break;
                } else {
                    k -= ways;
                    half[c]++;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);
        ans.append(mid);
        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }

    private long countWays(int[] cnt) {
        int total = 0;
        for (int x : cnt) total += x;

        long ans = 1;
        int rem = total;

        for (int f : cnt) {
            if (f == 0) continue;
            ans = multiply(ans, nCr(rem, f));
            if (ans >= LIMIT) return LIMIT;
            rem -= f;
        }

        return ans;
    }

    private long nCr(int n, int r) {
        if (r > n) return 0;
        r = Math.min(r, n - r);

        long res = 1;

        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;
            if (res >= LIMIT) return LIMIT;
        }

        return res;
    }

    private long multiply(long a, long b) {
        if (a == 0 || b == 0) return 0;
        if (a >= LIMIT || b >= LIMIT) return LIMIT;
        if (a > LIMIT / b) return LIMIT;
        return Math.min(LIMIT, a * b);
    }
}