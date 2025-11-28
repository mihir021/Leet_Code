import java.util.ArrayList;
import java.util.List;

class Leet118 {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<numRows; i++){
            ArrayList<Integer> al1 = new ArrayList<>();
            List<Integer> al2 = ans.get(i-1);
            for (int j = 0; j<=i; j++){
                if(j==0 || j==i) al1.add(1);
                else{
                    al1.add(al2.get(j-1)+al2.get(j));
                }
            }
            ans.add(al1);
        }
        return ans;
        // try nCr approach
    }
}