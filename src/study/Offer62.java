package study;

/**
 * @author yanggq
 * @create 2022-04-18 9:58
 */
/*
* 0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，
* 每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。
* 求出这个圆圈里剩下的最后一个数字。
  例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，
* 则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
*/
public class Offer62 {
    int x=0;
    public int lastRemaining(int n, int m) {
        return numberIndex(n,m);
    }

    public int numberIndex(int n,int m){
        if(n==1)
            return 1;
        numberIndex(n-1,m);
        return x=(m+x)%n;
    }

    public static void main(String[] args) {
        Offer62 offer62 = new Offer62();
        System.out.println(offer62.lastRemaining(10,17));
    }
}
