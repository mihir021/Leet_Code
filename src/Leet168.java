class Solution168 {

    String a[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
    public String convertToTitle(int columnNumber) {

        String ans = "";
        // 703   AAA
        do{
            if(columnNumber >= 0){

                if((columnNumber % 26) > 0)           ans += a[(columnNumber % 26) -1 ];
                else ans += "Z";

                if((columnNumber % 26) != 0)    columnNumber /= 26;
                else   columnNumber =(columnNumber/26) - 1;
            }
            else{
                break;
            }
        }while(columnNumber != 0);

        return new StringBuilder(ans).reverse().toString();
    }
}