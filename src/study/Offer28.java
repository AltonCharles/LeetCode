package study;

/**
 * @author yanggq
 * @create 2022-03-15 18:53
 */

/**
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。
 * 如果一棵二叉树和它的镜像一样，那么它是对称的。
 */
public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return false;
        TreeNode left,right;
        left=root.left;
        right=root.right;
        return LeftEqualRight(left,right);
    }

    //判断两个树是否相等
    public boolean LeftEqualRight(TreeNode Left,TreeNode Right){
        //中止条件
        if(Left==null&&Right==null)
            return true;
        if(Left==null&&Right!=null||Left!=null&&Right==null)
            return false;
        if(Left.val!=Right.val)
            return false;
        return LeftEqualRight(Left.left,Right.right)&&LeftEqualRight(Left.right,Right.left);
    }
}
