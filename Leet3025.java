class Solution3025 {
    public int numberOfPairs(int[][] points) {
        int ans = 0;
        int n = points.length;
        // Same sorting: x ascending, then y descending.
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (points[j][0] > points[j + 1][0] ||
                        (points[j][0] == points[j + 1][0] && points[j][1] < points[j + 1][1])) {
                    // swap
                    int tempX = points[j][0];
                    int tempY = points[j][1];
                    points[j][0] = points[j + 1][0];
                    points[j][1] = points[j + 1][1];
                    points[j + 1][0] = tempX;
                    points[j + 1][1] = tempY;
                }
            }
        }
        // Iterate through each point 'p2' as the lower-right candidate.
        for (int j = 0; j < n; j++) {
            int y2 = points[j][1];
            int minY = Integer.MAX_VALUE;

            for (int i = j - 1; i >= 0; i--) {
                int y1 = points[i][1];

                if (y1 >= y2 && y1 < minY) {
                    ans++;
                    minY = y1;
                }
            }
        }
        return ans;
    }
}