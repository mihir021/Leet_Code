class Solution1598 {
    public int minOperations(String[] logs) {
        int ans = 0;
        for (String log : logs) {
            if (log.endsWith("../")) {
                if (ans != 0) --ans;
                continue;
            }
            if (log.endsWith("./")) {
                continue;
            }
            if (log.endsWith("/")) {
                ans++;
            }
        }
        return ans;
    }
}