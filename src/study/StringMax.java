package study;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yanggq
 * @create 2021-06-16 21:13
 */
public class StringMax {
    public int testLength(String s){
        //将字符串转换成数组
        byte[] sBytes = s.getBytes();
        //key为存入的字符，value为下标
        Map<Byte,Integer> map=new HashMap<>();
        //标志
        int left=0;
        int Maxlength=0;
        for (int i = 0; i <sBytes.length; i++) {
            //不包含，1.添加到map  2.left不移动
            // 3.取最大值，不能使用Maxlength++会加多
            if(!map.containsKey(sBytes[i])){
               map.put(sBytes[i],i);
               //要加个判断，不能直接自加
                Maxlength=Math.max(i-left+1,Maxlength);
            }else{
                //left=map.get(sBytes[i])+1;
                left=Math.max(left,map.get(sBytes[i])+1);
                Maxlength=Math.max(i-left+1,Maxlength);
                map.put(sBytes[i],i);
            }

        }
        return Maxlength;
    }

    public static void main(String[] args) {
        //String s="abcabcbb";
        //String s="dvdf";
        String s="abba";
        StringMax stringMax=new StringMax();
        int length=stringMax.testLength(s);
        System.out.println(length);
    }
}
