package study;

/**
 * @author yanggq
 * @create 2022-03-01 20:33
 */

/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */

/**
 * 本题的问题在于找出如何划分才能满足乘积最大
 * 设计到数学证明问题，通过不等式求出在 每段长队相等时乘积最大
 * 而通过求导求极值问题求解当每段长度为3时乘积最大
 * 如果最后一段不够3
 * 例如1，2，则和倒数第二段一起划分
 */
public class Rope_Offer14 {
    public int cuttingRope(int n) {
        if(n<=3)
            return n-1;
        int mod=1000000007;
        int count=n/3;
        int last=n%3;
        long sum=1;
        //n>3
        for (int i = 0; i < count-1; i++) {
            sum=sum*3%1000000007;
        }
        if(last==1)
            return (int)((sum*4)%mod);
        if(last==2)
            return (int)((sum*6)%mod);
        else
            return (int)((sum*3)%mod);
    }

    public int test(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        long res = 1;
        while(n > 4){
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int)(res * n % 1000000007);
    }

    public static void main(String[] args) {
        Rope_Offer14 rope_offer14 = new Rope_Offer14();
        System.out.println(rope_offer14.cuttingRope(127));
        System.out.println(rope_offer14.test(127));
    }
}
