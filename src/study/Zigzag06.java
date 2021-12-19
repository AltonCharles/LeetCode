package study;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yanggq
 * @create 2021-12-15 18:07
 */
//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
//解题思路：寻早每个字符在改变形状后添加到字符串中的位置
//每次字符都会添加到新的一行，当在第一行和最后一行时，方向改变。
//StringBuffer线程安全与StirngBuilder线程不安，在单线程中性能更好
//HashTable线程安全     HashMap线程不安全
public class Zigzag06 {
    public String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        List<StringBuilder> list=new ArrayList<>();
        for(int i=0;i<Math.min(numRows,s.length());i++){
            list.add(new StringBuilder());
        }
        int cutRow=0;
        boolean goingDown=false;//方向true表示向下
        for(char a:s.toCharArray()){
            if(cutRow==0||cutRow==numRows-1)
                goingDown=!goingDown;
            list.get(cutRow).append(a);
            if(goingDown==true)
                ++cutRow;
            else --cutRow;
           // cutRow += goingDown ? 1 : -1;
        }
        StringBuilder str=new StringBuilder();
        for(StringBuilder sb:list){
            str.append(sb);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Zigzag06 zigzag06 = new Zigzag06();
        System.out.println(zigzag06.convert("abcd",5));
    }
}
