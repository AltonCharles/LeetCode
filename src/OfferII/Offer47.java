package OfferII;

/**
 * @author yanggq
 * @create 2022-04-30 20:18
 */
/*给定一个二叉树 根节点 root ，树的每个节点的值要么是 0，要么是 1。
请剪除该二叉树中所有节点的值为 0 的子树。
节点 node 的子树为 node 本身，以及所有 node 的后代。
**/
public class Offer47 {
    public TreeNode pruneTree(TreeNode root) {
        //如果是叶子结点
        if(root==null)
            return null;
        TreeNode left=pruneTree(root.left);
        TreeNode right=pruneTree(root.right);
        if(root.val==0&&left==null&&right==null){
            return null;
        }
        if(left==null)
            root.left=null;
        if(right==null)
            root.right=null;
        return root;
    }

}
