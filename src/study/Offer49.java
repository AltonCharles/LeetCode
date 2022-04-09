package study;

/**
 * @author yanggq
 * @create 2022-04-09 15:23
 */
/*
* 动态规划实现
* 1.状态的定义，dp[i]为第i+1个丑数
* 2.转移方程，dp[i]=min(dp[a]*2,dp[b]*3,dp[c]*5)
* 3.初始化的dp[0]为第一个丑数
* 4.返回值dp[n-1]
* */
public class Offer49 {
    public int nthUglyNumber(int n) {
        if(n<=0)
            return -1;
        int a=0,b=0,c=0;
        int[] dp=new int[n];
        dp[0]=1;
        for (int i = 1; i < n; i++) {
            dp[i]=toMin(dp[a]*2,dp[b]*3,dp[c]*5);
            if(dp[i]==dp[a]*2)
                ++a;
            if(dp[i]==dp[b]*3)
                ++b;
            if(dp[i]==dp[c]*5)
                ++c;
        }
        return dp[n-1];
    }

    public int toMin(int a,int b,int c){
        int temp=Math.min(a,b);
        return Math.min(temp,c);
    }

    public static void main(String[] args) {
        System.out.println(new Offer49().nthUglyNumber(10));;
    }

}
