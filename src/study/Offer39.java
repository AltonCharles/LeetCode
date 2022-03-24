package study;

/**
 * @author yanggq
 * @create 2022-03-24 11:01
 */


import java.util.Arrays;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class Offer39 {
    public int majorityElement(int[] nums) {
        /**
         * 1.直接遍历，记录重复数字个数hashmap实现
         * 2.数字排序，返回中间数
         * 3.摩尔投票法
         */
//        Arrays.sort(nums);
//        int index = nums.length / 2;
//        return nums[index];
         int votes=0,x=0;
         for(int num:nums){
             if(votes==0) x=num;
             votes+=num==x?1:-1;
         }
         return x;
    }

}
