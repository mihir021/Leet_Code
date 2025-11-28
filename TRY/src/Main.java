import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(1);
        for(int i = 0 ; i < s.size() ; i++){
            System.out.println();
        }
    }
}