class Solution2021 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations){
            switch (s) {
                case "X++" -> x++;
                case "++X" -> ++x;
                case "X--" -> x--;
                default -> --x;
            }
        }
        return x;
    }
}