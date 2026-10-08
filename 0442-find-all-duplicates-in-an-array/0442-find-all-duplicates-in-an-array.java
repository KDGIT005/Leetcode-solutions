class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x : nums){
            map.put(x , map.getOrDefault(x , 0)+1);
        } 
        for(int x : map.keySet()){
            if(map.get(x) == 2){
                ans.add(x);
            }
        }
        return ans;
    }
}