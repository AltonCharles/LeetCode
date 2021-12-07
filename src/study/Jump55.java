package study;

/**
 * @author yanggq
 * @create 2021-12-03 20:43
 */

/**
 * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个下标。
 */
public class Jump55 {
    public boolean canJump(int[] nums) {
        int length=nums.length;
        int count=0;//跳的最远位置
        //贪心算法，每次将当前位置能跳的最远距离记录，
        //判断最远距离能否大于length-1;
        for (int i = 0; i<=count; i++) {
            count=Math.max(i+nums[i],count);
            if(count>=length-1)
                return true;
        }
        return false;
    }

}
