class Solution1925 {
    public int countTriples(int n) {
        double temp = 0;
        int count = 0;
        for(int i = 3; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                temp = Math.sqrt((i*i) + (j*j));
                if((int)temp == temp && (int)temp<=n) count+=2;
            }
        }
        return count;
    }
}