import java.util.ArrayList;

class Solution1823 {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1 ; i <= n ; i++){
            arrayList.add(i);
        }
        int i = 0;
        while (arrayList.size()>1){
            i = (i+k-1)%arrayList.size();
            arrayList.remove(i);
        }
        return arrayList.removeFirst();
    }
}
class Solution1823H {
    public static int findTheWinner(int n, int k) {

        boolean[] arr1 = new boolean[n];
        int jump = 0;
        int temp = n;
        while(temp>1){

            jump = (jump+k)%temp;
            arr1[jump] = true;
            temp--;
        }
        for(boolean b:arr1){
            if(b) return temp;
            temp++;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }
}