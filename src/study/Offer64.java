package study;

/**
 * @author yanggq
 * @create 2022-04-24 10:50
 */
/*
* 求 1+2+...+n ，要求不能使用乘除法、
* for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
* */
public class Offer64 {
    int res=0;
    public int sumNums(int n) {
        boolean x=n>1&&sumNums(n-1)>1;
        res+=n;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Offer64().sumNums(3));
    }
}
