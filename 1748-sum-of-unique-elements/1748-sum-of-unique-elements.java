class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int x : nums){
            map.put(x , map.getOrDefault(x , 0)+1);
        }
        for(int x: nums){
            if(map.get(x) == 1){
                sum = sum + x;
            }
        }
        return sum;

    }
}