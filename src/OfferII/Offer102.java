package OfferII;

/**
 * @author yanggq
 * @create 2022-05-21 14:46
 */
/*
* 给定一个正整数数组 nums 和一个整数 target 。
向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：
例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，
* 然后串联起来得到表达式 "+2-1" 。
返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
*/
public class Offer102 {

    //递归实现
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums,target,0,0);
        return count;
    }

    public void backtrack(int[] nums,int target,int sum,int i){
        if(i==nums.length){
            if(target==sum){
                ++count;
            }
            return;
        }

        backtrack(nums,target,sum+nums[i],i+1);
        backtrack(nums,target,sum-nums[i],i+1);

    }

    //动态规划实现
}
