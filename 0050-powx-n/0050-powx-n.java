class Solution {

    public double myPow(double x, int n) {

        long p = n;
        double ans = 1.0;

        if (p < 0) {
            x = 1 / x;
            p = -p;
        }

        while (p > 0) {

            if ((p & 1) == 1) {
                ans *= x;
            }

            x *= x;
            p /= 2;
        }

        return ans;
    }
}