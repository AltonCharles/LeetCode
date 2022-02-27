package study;

/**
 * @author yanggq
 * @create 2022-02-26 16:07
 */
public class Sequence_Offer10 {
    //采用递归会超时，可以使用动态规划+滑动窗口
    public int fib(int n) {
        final int MOD = 1000000007;
        if(n<2)
            return n;
        int p=0,q=0,r=1;
        for (int i = 2; i <= n; i++) {
            p=q;
            q=r;
            r=(p+q)%MOD;
        }
        return r;
    }

    public static void main(String[] args) {
        Sequence_Offer10 offer10 = new Sequence_Offer10();
        System.out.println(offer10.fib(44));
    }
}
