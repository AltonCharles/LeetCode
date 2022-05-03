package OfferII;

/**
 * @author yanggq
 * @create 2022-05-03 14:37
 */
/*
*给定一个二叉搜索树，
* 请将它的每个节点的值替换成树中大于或者等于该节点值的所有节点值之和。
* */
public class Offer54 {
    int pre=0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null)
            return null;
        convertBST(root.right);
        root.val+=pre;
        pre=root.val;
        convertBST(root.left);
        return root;
    }
}
