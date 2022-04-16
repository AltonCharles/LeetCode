package study;

import java.util.Stack;

/**
 * @author yanggq
 * @create 2022-04-16 15:40
 */
/*
* 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
* 为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，
* 则输出"student. a am I"。
* */
public class Offer58I {
//    public String reverseWords(String s) {
//        //去除首尾空格
//        s=s.trim();
//        //根据字符串内的空格进行字符串分割
//        Stack<String> strings = new Stack<>();
//        char[] stemp=s.toCharArray();
//        int left=0,right=0;
//        //右指针指向的字符是否为为空格
//        boolean isNoChar=false;
//        for (int i = 0; i < stemp.length; i++) {
//            while (stemp[i]==' '){
//                continue;
//            }
//            while (stemp[i]!=' '){
//                ++right;
//            }
//            if(stemp[i]!=' '){
//                if(isNoChar){
//                    ++left;
//                    ++right;
//                    isNoChar=false;
//                }else{
//                    ++right;
//                }
//
//            }
//            if(stemp[i]==' '){
//                if(left<right){
//                    strings.push(s.substring(left,right));
//                    left=i;
//                    right=i;
//                }else{
//                    ++left;
//                    ++right;
//                }
//                isNoChar=true;
//            }
//        }
//        StringBuilder sb=new StringBuilder();
//        while (!strings.isEmpty()){
//            sb.append(strings.pop());
//        }
//        if(left<right){
//            sb.append(s.substring(left,right+1));
//        }
//        return sb.toString();
//    }

    public String reverseWords(String s) {
      s=s.trim();
      int i=s.length()-1;
      int j=i;
      StringBuilder builder = new StringBuilder();
      while (i>=0){
          while(i>=0&&s.charAt(i)!=' ')
              --i;
          builder.append(s.substring(i+1,j+1)+" ");
          while(i>0&&s.charAt(i)==' ')
              --i;
          j=i;
      }
      return builder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new Offer58I().reverseWords("the sky is blue"));
    }
}
