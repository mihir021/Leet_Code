/*
*
*   Input: n = 4
    Output: "1211"

    Explanation:
    countAndSay(1) = "1"
    countAndSay(2) = RLE of "1" = "11"
    countAndSay(3) = RLE of "11" = "21"
    countAndSay(4) = RLE of "21" = "1211"
    *
* */
class Solution38 {
    public static String countAndSay(int n) {
        String ans = "1";
        int counter = 1;
        StringBuilder temp = new StringBuilder();
        while(n-- > 0){
            for(int i = 0 ; i < (ans.length()-1) ; i++){
                if(ans.charAt(i)!=ans.charAt(i+1)){
                    temp.append(counter).append(ans.charAt(i));
                    counter = 1;
                    continue;
                }
                counter++;
            }
            if(counter >= 1){
                temp.append(counter).append(ans.charAt(ans.length() - 1));
                counter = 1;
            }
            ans = temp.toString();
            temp = new StringBuilder();
        }
        return ans;
    }

    public static void main(String[] args) {
        countAndSay(5);
    }
}