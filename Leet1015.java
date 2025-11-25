public class Leet1015 {
    public int smallestRepunitDivByK(int k) {
       if(k % 2 == 0 || k % 5 == 0) return -1;
        int rem = 1;
        int c = 0;
       while(true){
            rem = (rem*10+1)%k;
            if(rem == 0){
                return c;
            }
            c++;
       }

    }
}
