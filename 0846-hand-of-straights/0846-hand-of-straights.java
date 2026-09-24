class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : hand) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        pq.addAll(map.keySet());

        while (!pq.isEmpty()) {

            int first = pq.peek();

            for (int i = 0; i < groupSize; i++) {

                int card = first + i;

                if (!map.containsKey(card) || map.get(card) == 0) {
                    return false;
                }

                map.put(card, map.get(card) - 1);
            }

            while (!pq.isEmpty() && map.get(pq.peek()) == 0) {
                pq.poll();
            }
        }

        return true;
    }
}