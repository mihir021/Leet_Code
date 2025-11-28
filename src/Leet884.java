import java.util.*;

/**
 * A sentence is a string of single-space separated words where each word consists only of lowercase letters.
 *
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 *
 * Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
 */

class Solution884 {
    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] arr = s1.split(" ");
        HashSet<String> hs = new HashSet<>(List.of(arr));
        ArrayList<String> al = new ArrayList<>();

        arr = s2.split(" ");
        for (String s : arr) {
            if (hs.contains(s)) {
                al.add(s);
            }
        }
        return al.toArray(new String[0]);
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("a b c d", "a b c e")));;
    }
}