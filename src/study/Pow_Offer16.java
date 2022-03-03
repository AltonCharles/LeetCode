package study;

/**
 * @author yanggq
 * @create 2022-03-03 20:16
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 */
public class Pow_Offer16 {
    public double myPow(double x, int n) {
        if(x==0)
            return 0;
        double sum=1.0;
        long b=n;
        if(b<0){
            x=1/x;
            b=-b;
        }
        while (b>0){
            if((b&1)==1)
                sum*=x;
            x*=x;
            b>>=1;
        }
        return sum;
//            if(x == 0) return 0;
//            long b = n;
//            double res = 1.0;
//            if(b < 0) {
//                x = 1 / x;
//                b = -b;
//            }
//            while(b > 0) {
//                if((b & 1) == 1) res *= x;
//                x *= x;
//                b >>= 1;
//            }
//            return res;
        }

    public static void main(String[] args) {
        System.out.println(new Pow_Offer16().myPow(2,3));
    }
}
