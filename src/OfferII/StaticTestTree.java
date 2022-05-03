package OfferII;

/**
 * @author yanggq
 * @create 2022-05-02 20:15
 */

/**
 * 构建一个测试树
 */
public class StaticTestTree {
    //构建一个树
    /*
    *       1
    *    2     3
    *  4   5 6   7
    *
    * */
    public static TreeNode creTree(){
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        return root;
    }
    //先序遍历构建一个树
//    public static TreeNode creTreePre(){
//        TreeNode root = new TreeNode(1);
//        int i=2;
//        while (i<8){
//            if(root.left==null)
//            {
//                root.left=new TreeNode(i);
//                ++i;
//            }
//            if(root.right==null){
//                root.right=new TreeNode(i);
//                ++i;
//            }
//
//        }
//    }
}
