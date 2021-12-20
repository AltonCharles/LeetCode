package study;

/**
 * @author yanggq
 * @create 2021-12-19 14:55
 */

import java.util.Stack;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 */
public class IntegerInversion07 {
    public int reverse(int x) {
        //只考虑正
        if(x<10&&x>-10)
            return x;
        //flag控制正负
        int flag=x>0?1:-1;
        int temp=x*flag;
        //每次入栈的数
        int pushNumber=0;

        int sum=0;
        int i=0;
        Stack<Integer> stack=new Stack<>();
        while (temp>0){
            pushNumber=temp%10;//个位
            stack.push(pushNumber);
            temp=temp/10;

        }
        while (!stack.isEmpty()){
            sum+=stack.pop()*Math.pow(10,i);
            if(sum>=2147483647||sum<=-2147483648)
                return 0;
            ++i;
        }
        return sum*flag;
    }

    public static void main(String[] args) {
        IntegerInversion07 integerInversion07 = new IntegerInversion07();
        System.out.println( integerInversion07.reverse(-1534236469));
    }
}
