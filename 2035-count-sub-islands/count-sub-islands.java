class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length, n = grid2[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1) {
                    if (dfs(grid1, grid2, i, j))
                        count++;
                }
            }
        }

        return count;
    }

    private boolean dfs(int[][] g1, int[][] g2, int i, int j) {
        if (i < 0 || i >= g2.length || j < 0 || j >= g2[0].length
                || g2[i][j] == 0)
            return true;

        g2[i][j] = 0;

        boolean valid = g1[i][j] == 1;

        valid &= dfs(g1, g2, i + 1, j);
        valid &= dfs(g1, g2, i - 1, j);
        valid &= dfs(g1, g2, i, j + 1);
        valid &= dfs(g1, g2, i, j - 1);

        return valid;
    }
}