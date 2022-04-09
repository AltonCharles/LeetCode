package study;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yanggq
 * @create 2022-04-08 20:25
 */
/*
* 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
* */
public class Offer48 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res=0,i=-1;
        for (int j = 0; j < s.length(); j++) {
            if(dic.containsKey(s.charAt(j)))
                //这里错了i=Math.max(j,dic.get(s.charAt(j)));
                i=Math.max(i,dic.get(s.charAt(j)));
            dic.put(s.charAt(j),j);
            res=Math.max(res,j-i);
        }
        return res;
    }

//    public int lengthOfLongestSubstring2(String s) {
//        Map<Character, Integer> dic = new HashMap<>();
//        int i = -1, res = 0;
//        for(int j = 0; j < s.length(); j++) {
//            if(dic.containsKey(s.charAt(j)))
//                i = Math.max(i, dic.get(s.charAt(j))); // 更新左指针 i
//            dic.put(s.charAt(j), j); // 哈希表记录
//            res = Math.max(res, j - i); // 更新结果
//        }
//        return res;
//    }



    public static void main(String[] args) {
//        System.out.println(new Offer48().lengthOfLongestSubstring("abcabcbb"));
         System.out.println(new Offer48().lengthOfLongestSubstring("pwwkew"));
    }
}
