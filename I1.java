import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class I1 {
    // "bella","label","roller"
    public static List<String> commonChars(String[] words) {
        HashSet<String> al = new HashSet<>();
        int size = words[0].length();
        char temp;
        boolean fix;
        int index = 0;
        for(int i = 0 ; i < size ; i++){
            temp = words[0].charAt(i);
            fix = true;
            for (String word : words) {
                if (!word.contains(temp + "")) {
                    fix = false;
                    break;
                }
            }
            if(fix){
                al.add(temp+"");
            }
        }
        return al.stream().toList();
    }

    public static void main(String[] args) {
        String[] a = new String[]{"bella","label","roller"};
        commonChars(a);
    }
}
