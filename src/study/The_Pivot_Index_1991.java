package study;

import java.util.Arrays;

/**
 * @author yanggq
 * @create 2021-11-19 20:26
 */
/*给你一个整数数组 nums ，请计算数组的 中心下标 。
数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。

 */
public class The_Pivot_Index_1991 {
    //数组n个数求和
//    public int sumArray(int[] array,int n){
//        int sum=0;
//        for(int i=0;i<=n-1;i++){
//            sum+=array[i];
//        }
//        return sum;
//    }
    public int pivotIndex(int[] nums) {
        //int flag=0;//中心下标
        int sum=0;//数组和
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        //两个边界
        if(sum-nums[0]==0)
            return 0;
        int sumLeft=0;
        for(int flag=1;flag<nums.length;flag++){
            //int sumLeft=sumArray(nums,flag);//左侧下标和
            sumLeft+=nums[flag-1];
            int numFlag=nums[flag];//中心下标

            if(sumLeft*2+numFlag==sum)
                return flag;
        }
        return -1;
    }

    public static void main(String[] args) {
        The_Pivot_Index_1991 the_pivot_index_1991 = new The_Pivot_Index_1991();
        int[] m={1,7,3,6,5,6};
        int n=the_pivot_index_1991.pivotIndex(m);
        System.out.println(n);
    }
}

