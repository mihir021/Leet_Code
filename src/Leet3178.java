class Solution3178 {
    public int numberOfChild(int n, int k) {
        k = k % ((n-1)*2);
        int i = 0;
        while ( (i+1) != (n) && k !=0 ){
            k--;
            i++;
            if(k == 0) return i;
        }
        while (i != 0){
            k--;
            i--;
            if(k == 0) return i;
        }
        return i;
    }
}