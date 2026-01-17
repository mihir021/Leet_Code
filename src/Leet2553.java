import java.util.ArrayList;

class Solution2553 {
    public int[] separateDigits(int[] nums) {
//        ArrayList<Integer> al = new ArrayList<>();
//        String temp;
//        for (int num : nums) {
//            temp = num + "";
//            for(char c:temp.toCharArray()){
//                al.add(c-'0');
//            }
//        }
//        int size = al.size();
//        int []ans = new int[size];
//        for(int i = 0 ; i < size ; i++){
//            ans[i] = al.get(i);
//        }
//        return ans;

        StringBuilder sb = new StringBuilder();
        for (int numNum : nums){
            sb.append(numNum);
        }
        int size = sb.length();
        int ans[] = new int[size];
        for(int i = 0 ; i < size ; i++)    ans[i] = sb.charAt(i)-'0';
        return ans;
    }
}