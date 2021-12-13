package study;

/**
 * @author yanggq
 * @create 2021-12-08 19:39
 */
/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * 字符串正反读是一样的
 */

public class String05 {
    public String longestPalindrome(String s) {
         int Length=s.length();
         if(Length<2)
             return s;
         //定义回文串的最大长度
         int maxLength=1;
         //最大回文串的起始下标
         int start=0;
         int[][] tempt=new int[Length][Length];
         char[] chars = s.toCharArray();
         //i表示字符串左侧下标，j表示字符串右侧下标
         //当i=j时，即单个字符，true
//         for(int i=0;i<Length;i++)
//                tempt[i][i]=1;
         for(int j=1;j<s.length();j++){
            for(int i=0;i<j;i++){
                if(chars[i]!=chars[j])
                    tempt[i][j]=0;
                else {
                    if(j-i<3)
                        tempt[i][j]=1;
                    else{
                        tempt[i][j]=tempt[i+1][j-1];
                    }
                }
                if(tempt[i][j]==1&&j-i+1>maxLength){
                    maxLength=j-i+1;
                    start=i;
                }
            }
         }
        //substring(int beginIndex, int endIndex)beginIdex小标包括，endIndex下标不包括
        return s.substring(start,start+maxLength);
    }
    //判断字串是否存在相同的字符，相同返回false
//    public boolean isPalindromic(String s) {
//        int len = s.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (s.charAt(i) != s.charAt(len - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    public String longestPalindrome(String s) {
//        int Maxlength=0;
//        String temp="";
//        for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<=s.length();j++){
//                String test=s.substring(i,j);
//                if(isPalindromic(test)&&test.length()>Maxlength){
//                    temp=test;
//                    Maxlength=Math.max(Maxlength,temp.length());
//                }
//
//            }
//        }
//        return temp;
//    }

    public static void main(String[] args) {
        String05 string05 = new String05();
        //System.out.println(string05.longestPalindrome("a"));
        System.out.println(string05.longestPalindrome("accca"));
    }

}
