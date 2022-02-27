package study;

/**
 * @author yanggq
 * @create 2022-02-27 16:30
 */

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *
 * 给你一个可能存在 重复 元素值的数组 numbers ，它原来是一个升序排列的数组，
 * 并按上述情形进行了一次旋转。请返回旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为1。
 */
public class Rotate_Offer11 {
    public int minArray(int[] numbers) {
        int length=numbers.length;
        int left=0,right=length-1;
        while(left<right){
            if(numbers[left]>numbers[left+1])
                return numbers[left+1];
            if(numbers[right]<numbers[right-1])
                return numbers[right];

//            int mid=(left+right)/2;
//            if(numbers[mid]>numbers[right]){
//                left=mid+1;
//                continue;
//            }
            ++left;
            --right;
        }
        return numbers[0];
    }

    public static void main(String[] args) {
        Rotate_Offer11 rotate_offer11 = new Rotate_Offer11();
        int [] test={2,2,2,0,1};
        System.out.println(rotate_offer11.minArray(test));

    }
}
