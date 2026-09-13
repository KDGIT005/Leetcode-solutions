class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        Integer[] index = new Integer[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        Arrays.sort(index, (a, b) -> position[b] - position[a]);

        Stack<Double> st = new Stack<>();

        for (int i : index) {

            double time = (double)(target - position[i]) / speed[i];

            if (st.isEmpty() || time > st.peek()) {
                st.push(time);
            }
        }

        return st.size();
    }
}