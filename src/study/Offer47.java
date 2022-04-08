package study;

import java.awt.print.Printable;

/**
 * @author yanggq
 * @create 2022-04-08 15:56
 */
/*
* 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
* 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
* 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
* */
/*
* 动态规划
* 1.起始状态：dp[x][y],dp[0][0]=grid[0][0]
* 2.状态转移方程 dp[x][y]=Max(dp[x-1][y],dp[x][y-1])+grid[x][y],x-1>=0,y-1>=0
* 3.初始值
* 4.返回值
* */
public class Offer47 {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 0; i <= (m - 1); i++) {
            for (int j = 0; j <= (n - 1); j++) {
                //行到边界
                if(i==0&&j==0)
                    continue;
                if (i==0) {
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                    continue;
                }
                //列到边界
                if (j == 0) {
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                    continue;
                }
                //Math.max返回其中一个值
                dp[i][j]=Math.max(dp[i][j - 1], dp[i - 1][j])+grid[i][j];
            }

        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] a=new int[][]{{}};
        System.out.println(new Offer47().maxValue(a));
        System.out.println("----------");
    }

}
