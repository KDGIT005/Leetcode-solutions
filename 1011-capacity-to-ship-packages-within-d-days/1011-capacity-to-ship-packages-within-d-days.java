class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = 0;
        int min = 0;
        for(int i = 0; i<n; i++){
            max += weights[i];
            min = Math.max(min , weights[i]);
        }
        int l = min;
        int r = max;
        while(l<=r){
            int mid = l + (r-l) / 2;
            if(requried(weights , mid) <= days){
                r = mid - 1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
    private int requried(int[] weights , int capacity){
        int load = 0;
        int days = 1;
        for(int x : weights){
            if(load + x > capacity){
                days++;
                load = x;
            }else{
                load += x;
            }
        }
        return days;
    }
}