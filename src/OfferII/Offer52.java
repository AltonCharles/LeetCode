package OfferII;

/**
 * @author yanggq
 * @create 2022-05-02 19:47
 */
/*
*给你一棵二叉搜索树，请 按中序遍历 将其重新排列为一棵递增顺序搜索树，
* 使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点
* */
public class Offer52 {
    TreeNode head=new TreeNode(-1);
    TreeNode temp=head;
    public TreeNode increasingBST(TreeNode root) {
         bulidTree(root);
         return temp.right;

    }

    public void bulidTree(TreeNode root){
        //终止条件
        if(root==null)
            return ;
        //先序遍历

        bulidTree(root.left);
        //中序
        head.right=new TreeNode(root.val);
        head=head.right;
        bulidTree(root.right);
        //后序

    }

    public static void main(String[] args) {
        TreeNode root=StaticTestTree.creTree();
        Offer52 offer52=new Offer52();
        TreeNode node=offer52.increasingBST(root);
        while (node!=null){
            System.out.print(node.val+"  ");
            node=node.right;
        }

    }

}
