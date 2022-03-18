package study;

import java.util.Stack;

/**
 * @author yanggq
 * @create 2022-03-17 20:07
 */
//定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
// 调用 min、push 及 pop 的时间复杂度都是 O(1)。
public class Offer30 {
    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int count=0;//考虑重复元素
    public  Offer30() {
         stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int x) {
        //将x与minStack中的值比较，如果小，在minStack中入栈
        stack.push(x);
        if (minStack.isEmpty()||minStack.lastElement()>x){
            count=0;
            minStack.push(x);
            return;
        }
        if(minStack.lastElement()==x)
            ++count;
    }

    public void pop() {
        //不考虑重复
        if(stack.isEmpty())
            return;
        int x=stack.pop();
        if(x==minStack.lastElement()){
            if(count>0)
            {
                --count;
                return;
            }
            minStack.pop();
        }

    }

    public int top() {
        if(stack.isEmpty())
            return -1;
        return stack.lastElement();

    }

    public int min() {
        if(minStack.isEmpty())
            return -1;
        return minStack.lastElement();
    }

    public static void main(String[] args) {
        Offer30 offer30 = new Offer30();
        offer30.push(-2);
        offer30.push(0);
        offer30.push(-3);
        System.out.println(offer30.min());;
        offer30.pop();
        offer30.top();
        System.out.println(offer30.min());

//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack.lastElement());
    }
}
