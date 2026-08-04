class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int x : copy){
            if(!map.containsKey(x)){
                map.put(x , rank);
                rank++;
            }
        }
        for(int i=0; i<copy.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}