package study;

/**
 * @author yanggq
 * @create 2022-03-20 20:08
 */

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，
 * 找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 * 叶子节点 是指没有子节点的节点。
 */
public class Offer34 {
    LinkedList<List<Integer>> result=new LinkedList<>();
    LinkedList<Integer> path=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root==null)
            return null;
        dfs(root,target);
        return result;
    }

    public void dfs(TreeNode root,int target){
           if(root==null)
               return;
           path.add(root.val);
           target=target-root.val;
           if(root.right==null&&root.left==null&&target==0)
                result.add(new LinkedList<>(path));
           dfs(root.left,target);
           dfs(root.right,target);
           path.removeLast();
    }


}
