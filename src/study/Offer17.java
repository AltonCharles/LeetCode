package study;

import java.util.ArrayList;

/**
 * @author yanggq
 * @create 2022-03-03 21:21
 */
/*
输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999
 */
public class Offer17 {
    public int[] printNumbers(int n) {
        int Max=(int)Math.pow(10,n)-1;
        int [] res=new int[Max];
        for (int i = 0; i < Max; i++) {
            res[i]=i+1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Offer17().printNumbers(3));
    }
}
