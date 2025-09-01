class Solution1859 {
    public String sortSentence(String s) {
        String [] s1 = s.split(" ");
        StringBuilder ans = new StringBuilder();
        String [] s2 = new String[s1.length];
        for (String string : s1) {
            int temp = Integer.parseInt(string.substring(string.length() - 1));
            s2[temp - 1] = string.substring(0, string.length() - 1);
        }
        for (String s3 : s2){
            ans.append(s3).append(" ");
        }
        return ans.toString().trim();

    }
}