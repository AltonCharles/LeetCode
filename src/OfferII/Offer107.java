package OfferII;

/**
 * @author yanggq
 * @create 2022-05-24 14:05
 */
/*给定一个由 0 和 1 组成的矩阵 mat ，
请输出一个大小相同的矩阵，其中每一个格子是 mat 中对应位置元素到最近的 0 的距离。
两个相邻元素间的距离为 1 。
*
* */
public class Offer107 {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0)
                    continue;
                if (i == 0 && j == 0) {
                    dp[i][j] = 2000;
                    continue;
                }
                if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + 1;
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + 1;
                } else {
                    dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + 1;
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (mat[i][j] == 0)
                    continue;
                if (i == m - 1 && j == n - 1) {
                    continue;
                }
                if (i == m - 1) {
                    dp[i][j] = Math.min(dp[i][j + 1] + 1, dp[i][j]);
                } else if (j == n - 1) {
                    dp[i][j] = Math.min(dp[i + 1][j] + 1, dp[i][j]);
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i][j + 1], dp[i + 1][j]) + 1,dp[i][j]);
                }
            }
        }
        return dp;
    }
}
