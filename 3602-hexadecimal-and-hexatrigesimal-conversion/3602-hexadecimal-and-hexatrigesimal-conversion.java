class Solution {
    public String concatHex36(int n) {
        String hex16 = Integer.toString(n*n ,16).toUpperCase();
        String hex36 = Integer.toString(n*n*n , 36).toUpperCase();
        return hex16+hex36;
    }
}