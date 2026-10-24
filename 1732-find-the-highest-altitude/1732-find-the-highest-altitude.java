class Solution {
    public int largestAltitude(int[] gain) {
        int al = 0;
        int maxal = 0;
        for(int i = 0; i<gain.length; i++){
            al += gain[i];
            maxal = Math.max(maxal , al);
        }
        return maxal;
    }
}