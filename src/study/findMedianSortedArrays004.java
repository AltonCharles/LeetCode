package study;

/**
 * @author yanggq
 * @create 2021-11-01 20:30
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 * 请你找出并返回这两个正序数组的 中位数 。
 */
//有问题
public class findMedianSortedArrays004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //长度为奇数
        //长度为偶数
        //直接生成个新的数组，然后排序
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1==0){
            if(n2==0)
                return 0;
            if(n2%2!=0)
                return nums2[n2/2];
            else
                return (nums2[n2/2]+nums2[n2/2-1])/2.0;
        }
        if(n2==0){
            if(n1%2!=0)
                return nums1[n1/2];
            else
                return (nums1[n1/2]+nums1[n1/2-1])/2.0;
        }
        int length=n1+n2;

        int [] newNums=new int[length];
        for(int i=0;i<nums1.length;i++){
            newNums[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            newNums[nums1.length+j]=nums2[j];
        }
        return 0;

    }
}
