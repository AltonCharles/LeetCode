package study;

/**
 * @author yanggq
 * @create 2021-06-18 14:21
 */

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 *     左括号必须用相同类型的右括号闭合。
 *     左括号必须以正确的顺序闭合
 *
 */
public class ValidParentheses {
    //栈中firstElement()是指第一个入栈的元素，
    //lastElement()是指最后一个入站的元素
    //isEmpty()栈为空返回true
    //字符串中的charAt()方法下标索引从0开始
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        //char[] sChar=s.toCharArray();
        char symbol;
        //如果长度为奇数，返回flase
        if(s.length()/2!=0){
            return false;
        }
        for (int i = 0; i <s.length() ; i++) {
            symbol=s.charAt(i);
            if(symbol=='('||symbol=='['||symbol=='{'){
                stack.push(symbol);
            }else {
                if(stack.isEmpty()){
                    return false;
                }else if(symbol==')'){
                   if(stack.lastElement()=='(')
                   {
                       stack.pop();
                   }else {
                       return  false;
                   }
                }else if(symbol==']'){
                    if(stack.lastElement()=='[')
                    {
                        stack.pop();
                    }else {
                        return  false;
                    }
                }else if(symbol=='}'){
                    if(stack.lastElement()=='{')
                    {
                        stack.pop();
                    }else {
                        return  false;
                    }
                }
            }
        }
//        if(stack.isEmpty()){
//            return true;
//        }
//        return false;
        return  stack.isEmpty();
    }

    public static void main(String[] args) {
       // ValidParentheses validParentheses=new ValidParentheses();
        //String s="abcde";
       // char[] sChar=s.toCharArray();
        //System.out.println(sChar.toString());
//        Stack<Character> stack=new Stack<>();
//        stack.push('a');
//        stack.push('b');
//        stack.push('c');
//        String s="abc";
//        System.out.println(stack.firstElement());
//        System.out.println(stack.lastElement());
//        System.out.println(stack.isEmpty());
//        System.out.println(s.charAt(0));
        ValidParentheses validParentheses=new ValidParentheses();
        //String s = "()";
       // String s = "()[]{}";
//         String s = "(]";
 //       String s = "([)]";
    String s = "{[]}";
      //  String s="]";
        System.out.println(validParentheses.isValid(s));
    }
}
