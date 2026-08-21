class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n =  cardPoints.length;
       int lsum = 0;
       int rsum = 0;
       int max = 0;
       for(int i = 0; i<=k-1; i++){
        lsum += cardPoints[i];
       }
       max = lsum;
       int ridx = n-1;
       for(int i = k-1; i>=0; i--){
        lsum = lsum - cardPoints[i];
        rsum += cardPoints[ridx];
        ridx--;
        max = Math.max(max, lsum  + rsum);
       }
       return max;
    }
}