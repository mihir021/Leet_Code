class Solution498 {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];

        int row = 0;
        int col = 0;
        boolean isUp = true; // true for up-right, false for down-left

        for (int i = 0; i < ans.length; i++) {
            ans[i] = mat[row][col];

            if (isUp) {
                // Moving up-right
                if (col == n - 1) { // Hit right boundary
                    row++;
                    isUp = false;
                } else if (row == 0) { // Hit top boundary
                    col++;
                    isUp = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                // Moving down-left
                if (row == m - 1) { // Hit bottom boundary
                    col++;
                    isUp = true;
                } else if (col == 0) { // Hit left boundary
                    row++;
                    isUp = true;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}