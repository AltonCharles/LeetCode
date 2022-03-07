package study;

/**
 * @author yanggq
 * @create 2022-03-07 20:01
 */

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 */
public class Offer21 {
    public int[] exchange(int[] nums) {
        int left,right;
        left=0;
        right=nums.length-1;
        int temp;
        boolean moveRight=false,moveLeft=false;
        while (left<right){
            if(nums[left]%2!=0){
                ++left;
            }else {
                moveRight=true;
            }

            if(nums[right]%2==0){
                --right;
            }else {
                moveLeft=true;
            }

            if(moveLeft==true&&moveRight==true){
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                moveLeft=false;
                moveRight=false;
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        Offer21 offer21 = new Offer21();
        System.out.println(offer21.exchange(new int[]{1,2,3,4}));
    }
}
