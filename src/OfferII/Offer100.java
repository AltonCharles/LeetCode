package OfferII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yanggq
 * @create 2022-05-20 12:10
 */
/*
* 给定一个三角形 triangle ，找出自顶向下的最小路径和。
每一步只能移动到下一行中相邻的结点上。
* 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
* 也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
* */
public class Offer100 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int [][] dp=new int[n][n];
        dp[0][0]=triangle.get(0).get(0);
        int min=dp[0][0];


        for (int i = 1; i < n; i++) {
            for(int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                }else if (i==j){
                   dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
                }else{
                    dp[i][j]=Math.min(dp[i-1][j-1],dp[i-1][j])+triangle.get(i).get(j);
                }
            }
        }
        Arrays.sort(dp[n-1]);
        return dp[n-1][0];
    }

}
