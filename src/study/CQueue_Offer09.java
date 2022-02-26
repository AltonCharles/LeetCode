package study;

/**
 * @author yanggq
 * @create 2022-02-26 15:17
 */

import java.sql.SQLOutput;
import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ,
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。
 * (若队列中没有元素，deleteHead 操作返回 -1 )
 */
public class CQueue_Offer09 {
    //两个栈实现队列，队列先进先出，栈先进后出，
    //通过现在一个栈中进栈，然后出栈在另一个栈中进栈
    Stack<Integer> stackOne;
    Stack<Integer> stackTwo;
    public CQueue_Offer09() {
        stackOne=new Stack<>();
        stackTwo=new Stack<>();
    }

    public void appendTail(int value) {
        stackOne.push(value);
        //stackTwo.push(stackOne.pop());
    }

    public int deleteHead() {
//        if(stackTwo.isEmpty())
//            return -1;
//        while (!stackTwo.isEmpty()){
//            stackOne.push(stackTwo.pop());
//        }
//        int head=stackOne.pop();
//        while (!stackOne.isEmpty()){
//            stackTwo.push(stackOne.pop());
//        }
//        return head;
        if(!stackTwo.isEmpty()){
            return stackTwo.pop();
        }else {
            while (!stackOne.isEmpty())
            {
                stackTwo.push(stackOne.pop());
            }
        }
        return stackTwo.isEmpty()?-1:stackTwo.pop();
    }

    public static void main(String[] args) {
        CQueue_Offer09 cQueue_offer09 = new CQueue_Offer09();
        cQueue_offer09.appendTail(1);
        cQueue_offer09.appendTail(2);
        cQueue_offer09.appendTail(3);
        cQueue_offer09.appendTail(4);
        System.out.println(cQueue_offer09.deleteHead());
    }
}
