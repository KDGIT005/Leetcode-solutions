class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = 0;
        for(int x : piles){
            high = Math.max(high , x);
        }
        int l = 1;
        int r = high;
        while( l <= r){
            int mid  =  l + (r-l)/2;
            long k = 0;
            for(int x : piles){
                int hour = (int)Math.ceil((double) x / mid);
                k = k + hour;
            }
            if(k <= h){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}