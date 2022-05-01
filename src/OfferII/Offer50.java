package OfferII;

/**
 * @author yanggq
 * @create 2022-05-01 20:19
 */
/*
* 给定一个二叉树的根节点 root ，和一个整数 targetSum ，
* 求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
*  路径 不需要从根节点开始，也不需要在叶子节点结束，
* 但是路径方向必须是向下的（只能从父节点到子节点）。
* */
public class Offer50 {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        int ret=rootSum(root,targetSum);
        ret+=pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
        return ret;
    }
    //以root为根结点，满足targetSumd的个数
    public int rootSum(TreeNode root,int targetSum){
        int res=0;
        if(root==null)
            return 0;
        if(root.val==targetSum)
            ++res;
        res +=rootSum(root.left,targetSum-root.val);
        res +=rootSum(root.right,targetSum-root.val);
        return res;

    }
}
