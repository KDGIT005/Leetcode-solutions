class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n =nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int preSum=0;
        int count=0;
        map.put(0,1);

        for(int num:nums){
            preSum += num;
            int remove = preSum - goal;
            if(map.containsKey(remove)){
                count += map.get(remove);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }   
        return count;
    }
}