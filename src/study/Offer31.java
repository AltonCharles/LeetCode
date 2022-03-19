package study;

/**
 * @author yanggq
 * @create 2022-03-18 14:29
 */

import java.util.HashMap;
import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1}
 * 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 */
public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
//        int j=0;
//        for (int i = 0; i < pushed.length; i++) {
//            stack.push(pushed[i]);
//            if(stack.lastElement()==popped[j]&&!stack.isEmpty()){
//                stack.pop();
//                ++j;
//            }
//        }
        int i=0;
        for(int num : pushed) {
            stack.push(num); // num 入栈
            while(!stack.isEmpty() && stack.peek() == popped[i]) { // 循环判断与出栈
                stack.pop();
                i++;
            }
        }

        if(stack!=null)
            return false;
        return true;
    }

    //有问题
//    public boolean validateStackSequences(int[] pushed, int[] popped) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        //存放第一个出栈元素的左右，左右需要按照下标有小到大的顺序
//        if(pushed==null||pushed.length==0)
//            return true;
//        if(pushed.length==1){
//            if(pushed[0]==popped[0])
//                return true;
//            else
//                return false;
//
//        }
//
//        int Left=-1;
//        int Right=-1;
//        //临时存放
//        int temp;
//        for (int i = 0; i < pushed.length; i++) {
//            map.put(pushed[i],i);
//        }
//        //第一个出栈元素的位置
//        int mid=map.get(popped[0]);
//        for (int i = 0; i < popped.length; i++) {
//            temp=map.get(popped[i]);
//            if(temp==mid){
//                if(i+1>=popped.length)
//                    return true;
//                continue;
//            }
//            if(temp>mid){
//                if(Right==-1||Right>temp){
//                    Right=temp;
//                    continue;
//                }
//                if(Right<temp){
//                    return false;
//                }
//            }
//            if(temp<mid){
//                if(Left==-1||Left>temp){
//                    Left=temp;
//                    continue;
//                }
//                if(Left<temp){
//                    return false;
//                }
//            }
//
//        }
//        return true;
//    }
}
