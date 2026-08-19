class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
       LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int x : nums){
            map.put(x , map.getOrDefault(x , 0)+1);
        }
        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i]) == 2){
                set.add(nums[i]);
            }
        }
        return new ArrayList<>(set);
    }
}