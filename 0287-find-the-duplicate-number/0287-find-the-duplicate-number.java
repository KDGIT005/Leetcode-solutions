class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x , map.getOrDefault(x , 0)+1);
        }
        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i]) > 1){
                return nums[i];
            }
        }
        return -1;
    }
}