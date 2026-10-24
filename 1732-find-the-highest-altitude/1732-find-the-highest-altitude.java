class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        prefix[0] = 0;
        prefix[1] = gain[0];
        for(int i = 1; i<gain.length; i++){
            prefix[i+1] = prefix[i] + gain[i];
        }
        int ans = Integer.MIN_VALUE; 
        for(int i = 0; i<prefix.length; i++){
            ans = Math.max(ans  , prefix[i]);
        }
        return ans;
    }
}