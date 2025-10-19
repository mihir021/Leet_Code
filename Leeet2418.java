import java.util.Arrays;
import java.util.Hashtable;

class Solution2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        Hashtable<Integer,String> ht1 = new Hashtable<>();
        int j =0;
        for(int i : heights){
            ht1.put(i,names[j++]);
        }
        Arrays.sort(heights);
        j = 0;
        for(int i = heights.length-1; i>=0; i++){
            names[j++] = ht1.get(heights[i]);
        }
        return names;
    }
}