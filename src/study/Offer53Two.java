package study;

/**
 * @author yanggq
 * @create 2022-04-10 19:58
 */
/*
* 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
* 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
* */
public class Offer53Two {
    public int missingNumber(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while (i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==mid){
                i=mid+1;
            }
            if(nums[mid]>mid){
                j=mid-1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(new Offer53Two().missingNumber(new int[]{0}));
    }
}
