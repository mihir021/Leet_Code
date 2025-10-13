import java.util.ArrayList;
import java.util.List;

class Solution2273 {
    public List<String> removeAnagrams(String[] words) {
        int j = 0;
        ArrayList<String> al1 = new ArrayList<>();
        al1.add(words[0]);
        for (int i = 1; i< words.length; i++) {
            if (!areAnagrams(words[i], words[j])){
                al1.add(words[i]);
                j=i;
            }
        }
        return al1;
    }
    public boolean areAnagrams(String s, String t) {
        // code here
        if(s.length()!=t.length()){
            return false;
        }
        int[]count= new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}