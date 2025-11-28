class Solution3370 {
    public static int smallestNumber(int n) {
        while(true){
            String ans = "";
            ans = Integer.toBinaryString(n++);
            if(ans.replaceAll("1","").isEmpty()){
                return n-1;
            }
        }
    }

    public static void main(String[] args) {
        smallestNumber(994);
    }
}