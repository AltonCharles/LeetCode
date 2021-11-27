package study;

/**
 * @author yanggq
 * @create 2021-11-22 21:11
 */

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 */
public class SerachLoacation {
    public int searchInsert(int[] nums, int target) {
        int index;
        int left=0,right=nums.length-1;
        //left左指针，right右指针
//        if(target>nums[right])
//            return right+1;
//        if(target<nums[left])
//            return  left;
        //在while循环中已经考虑了特殊情况
        //如果在target大于所有，则循环结束left>right,返回最右侧+1（left=nums.length+1），即left位置
        //如果在target小于所有，则循环结束left<right,放回最左侧(right=-1,left=0)，即left位置
        //要考虑指针的移动条件
        while (left<=right){
            index=(left+right)/2;
            if(target==nums[index])
                return index;
            if(target>nums[index])
                left=index+1;
            if(target<nums[index])
                right=index-1;
        }
            return left;

    }

    public static void main(String[] args) {
        SerachLoacation serachLoacation=new SerachLoacation();
        int[] a={1,3,5,6};
        System.out.println(serachLoacation.searchInsert(a,0));
    }
}
