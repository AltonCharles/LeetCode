package OfferII;

import java.util.PriorityQueue;

/**
 * @author yanggq
 * @create 2022-05-05 13:57
 */
/*
* 树的搜素
* */
public class Dfs {
    public TreeNode dfs(TreeNode root){
        //终止条件
        if(root==null)
            return null;
        //先序遍历
        System.out.println(root.val);
        //递归
        dfs(root.left);
       /*
        根据子结点的操作修改父节点的引用
        root.left=dfs(root.left);

        递归到一个结点后，将其赋值给left然后
        回朔给上层，上层可以根据返回的left值
        做出相应的操作，
        TreeNode left=dfs(root.left);*/
        //中序遍历
        System.out.println(root.val);
        //递归
        dfs(root.right);
        //后序遍历
        System.out.println(root.val);
        //返回值
        //返回值根据具体题目返回特定的值，
        //主要是根据递归后根据左结点，右结点
        //结点值
        //这里的返回就是回溯
        return null;
    }
}
