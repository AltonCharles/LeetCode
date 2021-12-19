package study;

/**
 * @author yanggq
 * @create 2021-12-07 16:34
 */
/**
 * 给你一个非负整数数组 nums ，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * 假设你总是可以到达数组的最后一个位置。
 */
public class Jump45 {
    public int jump(int[] nums) {
        int count=0;//跳到最远点
        int start=0;//起跳点
        int end=1;
        int step=0;
        //一定要分析明白，
        while(end<nums.length){
            //求解一次循环的最远跳跃范围
            for(int i=start;i<end;i++){
                count=Math.max(count,i+nums[i]);
            }
            start=end;
            end=count+1;
            ++step;
        }
        return step;
    }

    public static void main(String[] args) {
        Jump45 jump45 = new Jump45();
       int[] nums={2,2,1,1,4};
        //int[] nums={1,1,2};
        System.out.println(jump45.jump(nums));
    }
}
