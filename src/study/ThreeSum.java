package study;

/**
 * @author yanggq
 * @create 2021-12-07 20:58
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0
 * 请你找出所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>  threeNumberList=new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                return threeNumberList;
            //重复位置跳过，跳过后一个重复位置，执行前一个
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                int Sum=nums[i]+nums[left]+nums[right];
                if(Sum==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    threeNumberList.add(list);
                    //去除重复解
                    while (left<right&&nums[left]==nums[left+1])
                        ++left;
                    while (left<right&&nums[right]==nums[right-1])
                        --right;
                    ++left;
                    --right;
                }
                else if(Sum>0)
                    --right;
                else
                    ++left;
            }
        }
        return threeNumberList;
    }

    public static void main(String[] args) {
        ThreeSum Sum = new ThreeSum();
        Sum.threeSum(new int[]{0,0,0});
        //int[] a=Sum.threeSum(new int[]{1, 3, 4, 2});
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
    }
}
