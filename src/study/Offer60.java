package study;

import java.util.Arrays;

/**
 * @author yanggq
 * @create 2022-04-16 18:17
 */
/*
* 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。
* 输入n，打印出s的所有可能的值出现的概率。
* 你需要用一个浮点数数组返回答案，
* 其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。
* */
public class Offer60 {
//    public double[] dicesProbability(int n) {
//        //n个筛子的点数范围min=n,max=6n,总共5n+1个
//        //题目就是求点数为min到max的概率
//
//
//        double p = Math.pow(1.0 / 6, n);
//        int number = n;
//        double[] result=new double[5*n+1];
//
//    }
//
//    public double[] dicesProbability(int n) {
//        double[] dp = new double[6];
//        Arrays.fill(dp, 1.0 / 6.0);
//        for (int i = 2; i <= n; i++) {
//            double[] tmp = new double[5 * i + 1];
//            for (int j = 0; j < dp.length; j++) {
//                for (int k = 0; k < 6; k++) {
//                    tmp[j + k] += dp[j] / 6.0;
//                }
//            }
//            dp = tmp;
//        }
//        return dp;
//    }
public double[] dicesProbability(int n) {
    double[] dp=new double[6];
    Arrays.fill(dp,1.0/6.0);
    for(int i=2;i<=n;i++){
        double[] temp=new double[i*5+1];
        for(int j=0;j<dp.length;j++){
            for(int k=0;k<6;k++){
                temp[j+k]+=dp[j]/6.0;
            }
        }
        dp=temp;
    }
    return dp;
}
    public static void main(String[] args) {
        Offer60 offer60 = new Offer60();
        offer60.dicesProbability(3);
    }
}
