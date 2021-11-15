package study;

/**
 * @author yanggq
 * @create 2021-11-10 16:56
 */

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
public class maxArea011 {
    public int maxArea(int[] height) {
        if(height.length<0)
            return -1;
        int max=0;
        int left=0,right=height.length-1;
        while (left!=right){
            int sumMax=(Math.min(height[left],height[right])*(right-left));
            if(height[left]<=height[right])
                ++left;
            else
                --right;
            //求容器的面积
            //int sumMax=(Math.min(height[left],height[right])*(right-left));
            if(sumMax>max)
                max=sumMax;
        }
        return max;
    }

    public static void main(String[] args) {
        maxArea011 max=new maxArea011();
        int [] height={1,2,3};
        System.out.println((max.maxArea(height)));
    }

}
