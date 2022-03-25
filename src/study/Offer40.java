package study;

/**
 * @author yanggq
 * @create 2022-03-25 9:44
 */

import java.util.Arrays;

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。
 * 例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */

/**
 * 使用堆和快排还未搞懂
 */
public class Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr,k);
    }

    public static void main(String[] args) {
        Offer40 offer40 = new Offer40();
        int[] result=offer40.getLeastNumbers(new int[]{3,2,1},2);
        System.out.println("test");
    }
}
