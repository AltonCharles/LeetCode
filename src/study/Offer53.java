package study;

/**
 * @author yanggq
 * @create 2022-04-10 14:57
 */
/*
*统计一个数字在排序数组中出现的次数。
* */
public class Offer53 {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int left,right;
        //寻找左边界
        while (i<=j){
            int mid=(i+j)/2;//向下取整
            //在mid左侧
            if(nums[mid]>target){
                j=mid-1;
            }
            //在mid右侧
            if(nums[mid]<=target){
                i=mid+1;
            }
        }
        right=i;
//        System.out.println(i);
//        System.out.println(j);
        if(nums[j]!=target)
            return 0;
        i=0;
        j=nums.length-1;
        while (i<=j){
            int mid=(i+j)/2;
            if(nums[mid]>=target){
                j=mid-1;
            }
            //在mid右侧
            if(nums[mid]<target){
                i=mid+1;
            }

        }
//        System.out.println(i);
//        System.out.println(j);
        left=j;
        return right-left-1;
    }

    public static void main(String[] args) {
        System.out.println(new Offer53().search(new int[]{1},2));
    }
}
