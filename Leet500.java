import java.util.ArrayList;
import java.util.List;

class Solution500 {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            if (isSingleRow(lower, row1) || isSingleRow(lower, row2) || isSingleRow(lower, row3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private boolean isSingleRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
