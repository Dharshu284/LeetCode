class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];

        int row = 0, col = 0;
        int index = 0;

        for (int i = 0; i < m * n; i++) {
            ans[index++] = mat[row][col];

            // Up-right direction
            if ((row + col) % 2 == 0) {
                if (col == n - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    row--;
                    col++;
                }
            }
            // Down-left direction
            else {
                if (row == m - 1) {
                    col++;
                } else if (col == 0) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return ans;
    }
}