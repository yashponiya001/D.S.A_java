class Solution {
    public int uniquePaths(int m, int n) {
     Integer[][] memo = new Integer[m][n];
        return findPath(m - 1, n - 1, memo);
    }

    private int findPath(int r, int c, Integer[][] memo){

        if(r == 0 && c == 0)
            return 1;

        if(r < 0 || c < 0)
            return 0;

        if(memo[r][c] != null)
            return memo[r][c];

        int up = findPath(r - 1, c, memo);
        int left = findPath(r, c - 1, memo);

        memo[r][c] = up + left;

        return memo[r][c];
    }
}
