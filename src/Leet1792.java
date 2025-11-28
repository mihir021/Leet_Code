import java.util.PriorityQueue;

class Solution1792 {
    static class ClassInfo {
        int pass, total;

        ClassInfo(int pass, int total) {
            this.pass = pass;
            this.total = total;
        }

        double gain() {
            return ( (double)(pass + 1) / (total + 1) ) - ( (double)pass / total );
        }

        double ratio() {
            return (double) pass / total;
        }
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<ClassInfo> pq = new PriorityQueue<>(
                (a, b) -> Double.compare(b.gain(), a.gain())
        );

        for (int[] c : classes) {
            pq.offer(new ClassInfo(c[0], c[1]));
        }

        while (extraStudents-- > 0) {
            ClassInfo best = pq.poll();   // take the class with max gain
            best.pass++;
            best.total++;
            pq.offer(best);              // put it back with updated values
        }

        double ans = 0;
        for (ClassInfo c : pq) {
            ans += c.ratio();
        }

        return ans / classes.length;
    }
}