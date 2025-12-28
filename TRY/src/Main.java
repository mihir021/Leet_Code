import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    int minTime(int n , int[] rank){
        PriorityQueue<My> pq = new PriorityQueue<>(Comparator.comparing(My::getRank));
        int ans = 0;
        for (int i : rank){
            pq.add(new My(1,i));
        }
        while (n > 0){
            My minTime = pq.remove();
            ans += minTime.rank;
            minTime.count++;
            minTime.rank = minTime.rank*minTime.count;
            pq.add(minTime);
            n--;
        }
        return ans;
    }
    class My{
        int count;
        int rank;

        public My(int count, int rank) {
            this.count = count;
            this.rank = rank;
        }

        public int getRank() {
            return rank;
        }
    }
}