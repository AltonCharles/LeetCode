package OfferII;

/**
 * @author yanggq
 * @create 2022-05-10 14:48
 */
/*
* 给定一个字符串 s ，请计算这个字符串中有多少个回文子字符串。
具有不同开始位置或结束位置的子串，即使是由相同的字符组成，
* 也会被视作不同的子串。
* */
public class OfferII20 {
    private int countSubstrings(String s) {
        int n=s.length();
        if(n<=1)
            return 1;
        int count=0;
        boolean[][] dp=new boolean[n][n];
        for(int i=n-1;i>=0;--i){
            for(int j=i;j<n;++j){
                int length=j-i+1;
                if(length==1)
                {
                    dp[i][j]=true;
                    ++count;
                    continue;
                }
                boolean flag=(s.charAt(i)==s.charAt(j));
                if(length==2){
                    dp[i][j]=flag;
                }
                else {
                    dp[i][j]=flag&dp[i+1][j-1];
                }
                count+=dp[i][j]?1:0;
//                if(dp[i][j])
//                    ++count;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        OfferII20 offerII20 = new OfferII20();
        System.out.println(offerII20.countSubstrings("aba"));
    }
}
