package study;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author yanggq
 * @create 2022-04-08 14:15
 */
public class Offer46 {
    /*动态规划
    * 1.状态定义
    * 2.转移方程
    * 3.初始值
    * 4.返回值
    *
    * */
//    public int translateNum(int num) {
//        //将num转化为对应的数组
//        if(num<=9)
//            return 1;
//        int[] nums=intToArray(num);
//        //dp[i]表示转会为数组后从开始到下标i的翻译方法数
//        int[] dp=new int[nums.length+1];
//        dp[0]=dp[1]=1;
//        int i=2;
//        while (i<=dp.length-1){
//            int flag=nums[i-2]*10+nums[i-1];
//            if(flag>=10&&flag<=25)
//                dp[i]=dp[i-1]+dp[i-2];
//            else
//                dp[i]=dp[i-1];
//            ++i;
//        }
//        return dp[nums.length];
//
//    }
//
//    public int [] intToArray(int num){
//        //有没有考虑顺序
//        ArrayList<Integer> list = new ArrayList<>();
//        while(num>0){
//            int temp=num%10;
//            list.add(temp);
//            num/=10;
//        }
//        Iterator<Integer> iterator = list.iterator();
//        int [] a=new int[list.size()];
//        int i=list.size()-1;
//        while (iterator.hasNext()){
//            a[i]=iterator.next();
//            --i;
//        }
//        return a;
//    }

    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        /*
        * *substring(beginIndex,endIndex)开始索引包括，结束索引不包括，
        * 截取字符长度end-bengin
        *  @param      beginIndex   the beginning index, inclusive.
         *  @param      endIndex     the ending index, exclusive.
        * */
        for(int i = 2; i <= s.length(); i ++){
            String temp = s.substring(i-2, i);
            if(temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0)
                dp[i] = dp[i-1] + dp[i-2];
            else
                dp[i] = dp[i-1];
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        System.out.println(new Offer46().translateNum(12345));
    }
}
