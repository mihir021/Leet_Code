class Solution2125 {
    public int numberOfBeams(String[] bank) {
        int numberOfOneInCurrent = 0;
        int numberOfOneInNext = 0;
        int ans = 0;

        for (String s : bank) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1')
                    numberOfOneInNext++;
            }
            if (numberOfOneInNext != 0) {
                ans += numberOfOneInCurrent * numberOfOneInNext;
                numberOfOneInCurrent = numberOfOneInNext;
                numberOfOneInNext = 0;
            }
        }

        return ans;
    }
}