class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x , map.getOrDefault(x , 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
        (a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        int[] ans =  new int[k];
        for(int i = 0; i<k; i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}