class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] ans = new int[rows * cols][2];
        int index = 0;

        int r = rStart;
        int c = cStart;

        // Starting position
        ans[index++] = new int[]{r, c};

        int step = 1;

        while (index < rows * cols) {

            // Move East →
            for (int i = 0; i < step; i++) {
                c++;

                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[index++] = new int[]{r, c};
                }
            }

            // Move South ↓
            for (int i = 0; i < step; i++) {
                r++;

                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[index++] = new int[]{r, c};
                }
            }

            step++;

            // Move West ←
            for (int i = 0; i < step; i++) {
                c--;

                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[index++] = new int[]{r, c};
                }
            }

            // Move North ↑
            for (int i = 0; i < step; i++) {
                r--;

                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[index++] = new int[]{r, c};
                }
            }

            step++;
        }

        return ans;
    }
}