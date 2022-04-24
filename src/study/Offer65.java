package study;

/**
 * @author yanggq
 * @create 2022-04-24 18:54
 */
/*
* 写一个函数，求两个整数之和，
* 要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
* */
public class Offer65 {
    public int add(int a, int b) {
    //a无进位之和
    //b进位之和
    int temp;
    while (b!=0){
        //无进位之和
        temp=a^b;
        b=(a&b)<<1;
        a=temp;
    }
    return a;
    }

    public static void main(String[] args) {
        System.out.println(new Offer65().add(0,1));
    }
}
