class Solution9 {
    public boolean isPalindrome(int x) {

        boolean ans = false;
        String number = String.valueOf(x);
        String rev_number = "";

        for (int i = 0; i < number.length(); i++) {
            rev_number = rev_number + number.charAt(number.length() - (i + 1));
            //System.out.println(rev_number);
        }

        if (rev_number.equals(number)) {
            ans = true;
        }


        return ans;

    }
}
