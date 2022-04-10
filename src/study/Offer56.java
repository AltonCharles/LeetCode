package study;

/**
 * @author yanggq
 * @create 2022-04-10 21:34
 */
/*
* 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
* 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
* */
public class Offer56 {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        boolean flag= Math.abs((maxDepth(root.left)-maxDepth(root.right)))>1?false:true;
        return flag&&isBalanced(root.left)&&isBalanced(root.right);
    }
    //求树高
    public int maxDepth(TreeNode root) {
        int h=1;
        if(root==null)
            return 0;
        return h+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.right.left=new TreeNode(5);
        node.left.left=new TreeNode(4);
        node.left.left.left=new TreeNode(6);
        System.out.println(new Offer56().isBalanced(node));
    }

}
