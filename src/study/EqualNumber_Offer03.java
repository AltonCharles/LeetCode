package study;

/**
 * @author yanggq
 * @create 2022-02-09 16:03
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 剑指Offer 03
 */

public class EqualNumber_Offer03 {
    //set集合要求元素不能重复
    public int findRepeatNumber3(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(set.add(nums[i]))
                continue;
            return nums[i];
        }
        return -1;
    }

    //原地互换 这种思想很不错，利用了题目给出的数字范围在0~n-1
    //和数组长度保持了一致，所以通过索引实现将数组中的数字存在以其
    //数字大小位编号的数组中
    public int exchange(int[] nums) {
        //for里的i不能加
        int temp;
      for (int i = 0; i < nums.length;) {
            if(nums[i]==i){
                ++i;
                continue;
            }
            if(nums[i]!=nums[nums[i]]){
                temp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
                continue;
            }
            return nums[i];
        }
       return -1;
    }


    public static void main(String[] args) {
        EqualNumber_Offer03 equalNumber_offer03 = new EqualNumber_Offer03();
        int [] a={0,3,1,0,2,5,3};
        System.out.println(equalNumber_offer03.exchange(a));
    }
}
