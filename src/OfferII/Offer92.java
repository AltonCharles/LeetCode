package OfferII;

/**
 * @author yanggq
 * @create 2022-05-17 12:48
 */
/*如果一个由 '0' 和 '1' 组成的字符串，
是以一些 '0'（可能没有 '0'）后面跟着一些 '1'（也可能没有 '1'）的形式组成的，
那么该字符串是 单调递增 的。
我们给出一个由字符 '0' 和 '1' 组成的字符串 s，
我们可以将任何 '0' 翻转为 '1' 或者将 '1' 翻转为 '0'。
返回使 s 单调递增 的最小翻转次数。
*/
public class Offer92 {
    public int minFlipsMonoIncr(String s) {
//        char[] chars = s.toCharArray();
////        int n=chars.length;
////        int[] dp=new int[n+1];
////        dp[0]=0;
////        dp[1]=0;
//        int count=0;
//        char temp;
//        for (int i = 1; i < chars.length; i++) {
//            if(chars[i]-chars[i-1]<0){
//                temp=chars[i];
//                chars[i]=chars[i-1];
//                chars[i-1]=temp;
//                ++count;
//                continue;
//            }
//        }
//        return count;

        int n=s.length();
        int[][] dp = new int[n][2];
        //前i+1个元素，转换成已0/1结尾的的次数
        dp[0][0]=s.charAt(0)=='0'?0:1;
        dp[0][1]=s.charAt(0)=='1'?0:1;
        for (int i = 1; i < n; i++) {
            dp[i][0]=dp[i-1][0]+(s.charAt(i)=='0'?0:1);
            dp[i][1]=Math.min(dp[i-1][0],dp[i-1][1])+(s.charAt(i)=='1'?0:1);
        }
        return Math.min(dp[n-1][0],dp[n-1][1]);

    }

}
