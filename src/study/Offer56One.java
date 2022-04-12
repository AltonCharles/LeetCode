package study;

/**
 * @author yanggq
 * @create 2022-04-12 20:23
 */
/*
* 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
* 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
* */
//两个相同的数异或为零，一个数与0异或结果不变
public class Offer56One {
    public int[] singleNumbers(int[] nums) {
        int x=0,y=0;
        int temp=0;
        int m=1;
        //将nums中的所有说异或
        for(int num:nums){
            temp^=num;
        }
        //此时temp为x与y的异或值
        while ((temp&m)==0){
            m<<=1;
        }
        for(int num:nums){
            if((num&m)==0)
                x^=num;
            else
                y^=num;
        }
        return new int[]{x,y};
    }

    public static void main(String[] args) {
        System.out.println(new Offer56One().singleNumbers(new int[]{1,1,2,3,4,4})[0]);
        System.out.println(new Offer56One().singleNumbers(new int[]{1,1,2,3,4,4})[1]);
    }
}
