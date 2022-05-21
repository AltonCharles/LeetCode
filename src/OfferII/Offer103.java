package OfferII;

import java.util.Arrays;

/**
 * @author yanggq
 * @create 2022-05-21 15:51
 */
/*
* 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
* 如果没有任何一种硬币组合能组成总金额，返回 -1。
你可以认为每种硬币的数量是无限的。

* */
public class Offer103 {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(coins[j]<=i){
                    int k=coins[j];
                    dp[i]=Math.min(dp[i-k]+1,dp[i]);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
