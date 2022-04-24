package study;

/**
 * @author yanggq
 * @create 2022-04-18 11:00
 */
/*
* 假设把某股票的价格按照时间先后顺序存储在数组中，
* 请问买卖该股票一次可能获得的最大利润是多少？
* */
public class Offer63 {
    public int maxProfit(int[] prices) {
        if(prices.length==0||prices.length==1)
            return 0;
        int left=0,right=1;
        int sum=0;
        for (int i = 0; i < prices.length-1; i++) {
            int number=prices[right]-prices[left];
            if(number>0){
                sum+=number;
                left=right;
                ++right;
                continue;
            }
            if(sum==0)
                ++left;
            ++right;

        }
        return sum;
    }
    //
    public int maxProfit2(int[] prices) {
        //dp[i]表示连续i天的最大收入
        if(prices.length<=1)
            return 0;
        int[] dp=new int[prices.length];
        int minprice=0;
        dp[0]=0;
        //暂存i前面的prices最小值
        int res=prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i]=Math.max(dp[i-1],prices[i]-res);
            res=Math.min(res,prices[i]);
        }
        return dp[prices.length-1];
    }

    public static void main(String[] args) {
        Offer63 offer63 = new Offer63();
        System.out.println(offer63.maxProfit2(new int[]{7,6,4,3,1}));
    }
}
