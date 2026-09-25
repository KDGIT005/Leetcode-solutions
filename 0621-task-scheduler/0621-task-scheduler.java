class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char task : tasks) {
            freq[task - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int f : freq) {
            if (f > 0) {
                pq.add(f);
            }
        }

        int time = 0;

        while (!pq.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();

            int cycle = n + 1;

            while (cycle > 0 && !pq.isEmpty()) {
                int f = pq.poll();

                if (f - 1 > 0) {
                    temp.add(f - 1);
                }

                time++;
                cycle--;
            }

            for (int f : temp) {
                pq.add(f);
            }

            if (!pq.isEmpty()) {
                time += cycle;
            }
        }

        return time;
    }
}