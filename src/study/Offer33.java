package study;

/**
 * @author yanggq
 * @create 2022-03-20 14:51
 */

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，
 * 否则返回 false。假设输入的数组的任意两个数字都互不相同。
 */
public class Offer33 {
    public boolean verifyPostorder(int[] postorder) {
        return IsLast(0,postorder.length-1,postorder);
    }

    public boolean IsLast(int left,int right,int[] array){
        if(left>=right)
            return true;
        int temp=left;
        while (array[temp]<array[right])
            ++temp;
        int m=temp;
        while (array[m]>array[right])
            ++m;
        return right==m && IsLast(left,temp-1,array) && IsLast(temp,m-1,array);
    }
}
