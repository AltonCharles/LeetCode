package study;

/**
 * @author yanggq
 * @create 2022-04-14 20:38
 */
/*
* 输入一个递增排序的数组和一个数字s，
* 在数组中查找两个数，使得它们的和正好是s。
* 如果有多对数字的和等于s，则输出任意一对即可
* */
//快排
public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int j=nums.length-1;
        while (left<nums.length-1&&left<j){
            int M=target-nums[left];
            int i=left+1;
            while (i<=j){
                int mid=(i+j)/2;
                if(nums[mid]>M){
                    j=mid-1;
                }
                if(nums[mid]<M)
                    i=mid+1;
                if(nums[mid]==M)
                    return new int[]{nums[left],nums[mid]};
            }
            ++left;
        }
        return null;
    }

    /*双指针解法
    *   public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int s = nums[i] + nums[j];
            if(s < target) i++;
            else if(s > target) j--;
            else return new int[] { nums[i], nums[j] };
        }
        return new int[0];
    }

    *
    * */
    public static void main(String[] args) {
        int[] a=new Offer57().twoSum(new int[]{1,2,3,4,5,6,7},9);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
