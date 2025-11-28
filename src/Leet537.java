class Solution537 {
    int a, b, c, d;
    public String complexNumberMultiply(String num1, String num2) {
        int plusIndex = num1.indexOf('+');
        a = Integer.parseInt(num1.substring(0, plusIndex));
        b = Integer.parseInt(num1.substring(plusIndex + 1, num1.length() - 1));

        plusIndex = num2.indexOf('+');
        c = Integer.parseInt(num2.substring(0, plusIndex));
        d = Integer.parseInt(num2.substring(plusIndex + 1, num2.length() - 1));

        return ( (a * c) - (b * d) ) + "+" +  ((a * d) + (b * c)) + "i";
    }
}