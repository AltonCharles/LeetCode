package study;

/**
 * @author yanggq
 * @create 2021-12-23 19:56
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 */
//栈要考虑内存溢出的问题
public class Palindrome09 {
    //栈实现
//    public boolean isPalindrome(int x) {
//        if(x<0)
//            return false;
//        if(x<10)
//            return true;
//        int newX=x;
//        int temp;
//        int sum=0;
//        int i=0;
//        Stack<Integer> stack=new Stack<>();
//        while(newX>0){
//            temp=newX%10;
//            newX=newX/10;
//            stack.add(temp);
//        }
//        while (!stack.isEmpty()){
//            sum+=Math.pow(10,i)*stack.pop();
//            if(sum>=2147483647)
//                return false;
//            ++i;
//        }
//        if(sum==x)
//            return true;
//        return false;
//    }

    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x<10)
            return true;
        ArrayList<Integer> arrayList=new ArrayList<>();
        int newX=x;
        int temp;
        int i=0;
        while(newX>0){
            temp=newX%10;
            newX=newX/10;
            arrayList.add(temp);
            ++i;
        }
        int left=0;
        int right=i-1;
        while (left<right){
            if(arrayList.get(left)!=arrayList.get(right))
                return false;
            ++left;
            --right;
        }
        return true;
    }


    public static void main(String[] args) {
        Palindrome09 palindrome09 = new Palindrome09();
        System.out.println(palindrome09.isPalindrome(121));

    }
}
