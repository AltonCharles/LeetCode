package study;

/**
 * @author yanggq
 * @create 2022-02-26 20:28
 */

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class Forg_Offer10_II {
    public int numWays(int n) {
        final int mod=1000000007;
        if(n==0||n==1)
            return 1;
        int p=0,q=1,r=1;
        for (int i = 2; i <= n; i++) {
            p=q;
            q=r;
            r=(p+q)%mod;
        }
        return  r;
    }
}
