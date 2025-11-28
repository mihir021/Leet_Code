import java.util.ArrayList;
import java.util.List;

class Solution2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int size = words.length;
        for(int i =0 ; i < size ;i++){
            if(words[i].contains(x+"")){
                list.add(i);
            }
        }
        return list;
    }
}