package study;

/**
 * @author yanggq
 * @create 2022-04-14 19:57
 */
/*在一个数组 nums 中除一个数字只出现一次之外，
其他数字都出现了三次。请找出那个只出现一次的数字。
* */
/*
* 书上解法： 如果一个数字出现3次，它的二进制每一位也出现的3次。
* 如果把所有的出现三次的数字的二进制表示的每一位都分别加起来，
* 那么每一位都能被3整除。 我们把数组中所有的数字的二进制表示的每一位都加起来。如果某一位能被3整除，
* 那么这一位对只出现一次的那个数的这一肯定为0。如果某一位不能被3整除，那么只出现一次的那个数字的该位置一定为1
*
* */
public class Offer56II {
    public int singleNumber(int[] nums) {
        int temp = 0;
        int[] count = new int[32];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                count[j] += nums[i] & 1;
                nums[i] >>= 1;
            }
        }
        for (int i = 0; i < 32; i++) {
            if (count[i] % 3 != 0 ) {
                temp += 1 << i;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Offer56II offer56II = new Offer56II();
        System.out.println(offer56II.singleNumber(new int[]{2,2,2,3,3,3,4}));
    }
}
