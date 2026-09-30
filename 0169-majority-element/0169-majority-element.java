class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int curr = 0;
        for(int x : nums){
            if(cnt == 0){
                curr = x;
            }
            if(curr == x){
                cnt++;
            }else{
                cnt--;
            }
        }
        return curr;
    }
}