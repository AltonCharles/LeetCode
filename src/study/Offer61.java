package study;

import java.util.Arrays;

/**
 * @author yanggq
 * @create 2022-04-16 20:38
 */
/*
* 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。
* 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，
* 可以看成任意数字。A 不能视为 14。
* */
public class Offer61 {
    public boolean isStraight(int[] nums) {
        //首先对数组进行升序排序
        Arrays.sort(nums);
        int i=0;
        for(int j=0;j<5;j++){
            if(nums[j]==0)
                ++i;
            else if(j==4)
                continue;
            else if(nums[j]==nums[j+1]){
                return false;
            }
        }
        return nums[4]-nums[i]>4?false:true;
    }

    public static void main(String[] args) {
        Offer61 offer61 = new Offer61();
        System.out.println(offer61.isStraight(new int[]{13,13,9,12,10}));
    }
}
