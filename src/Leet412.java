import java.util.ArrayList;
import java.util.List;

/*
* Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
* */

class Solution412 {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> al = new ArrayList<>();
        int max = n;
        n = 1;
        while (n != max){
            if(( n % 3 == 0 ) && (n % 5 == 0) ){
                al.add("FizzBuzz");
            } else if (( n % 3 == 0 )) {
                al.add("Fizz");
            } else if(n % 5 == 0){
                al.add("Buzz");
            } else {
                al.add(String.valueOf(n));
            }
            n++;
        }
        return al;
    }
}