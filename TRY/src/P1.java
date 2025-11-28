    static int ans = 0;
    static int k = 3;

    public static void main(String[] args) {
        int[][] a = {
                {5, 2, 4},
                {3, 0, 5},
                {0, 7, 2}
        };

        rec(a, 0, 0, 0);
        System.out.println(ans);
    }

    static void rec(int[][] a, int sum, int i, int j) {
        int n = a.length;
        int m = a[0].length;

        // Out of bounds → invalid path, just return
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return;
        }

        // Add current cell
        sum += a[i][j];

        // If we reached bottom-right cell, check sum
        if (i == n - 1 && j == m - 1) {
            if (sum % k == 0) {
                ans++;
            }
            return;
        }

        rec(a, sum, i + 1, j);

        rec(a, sum, i, j + 1);
    }
