import java.util.List;

class Solution3289 {
    public static int[] getSneakyNumbers(int[] nums) {
        int[] a = new int[100];
        int c = 0;
        for (int num : nums) {
            a[num]++;
            if(a[num]==2){
                c++;
            }else if(a[num] > 2){
                c--;
            }
        }
        int i = 0;
        int []ans = new int[c];
        for(int a1 = 0 ; a1 < a.length; a1++){
            if(a[a1]==2){
                ans[i++] = a1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        getSneakyNumbers(new int[]{0,3,2,1,3,2});
    }
}