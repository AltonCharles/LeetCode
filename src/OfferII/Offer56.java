package OfferII;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanggq
 * @create 2022-05-03 15:05
 */
/*
* 给定一个二叉搜索树的 根节点 root 和一个整数 k ,
*  请判断该二叉搜索树中是否存在两个节点它们的值之和等于 k 。
* 假设二叉搜索树中节点的值均唯一。
* */
public class Offer56 {
    List<Integer> list=new ArrayList<>();
    boolean flag=false;
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)
            return false;
        if(flag==true)
            return true;
        findTarget(root.left,k);
        int val=root.val;
        if(list.contains(val))
        {
            flag=true;
        }else {
            list.add(k-val);
        }
        findTarget(root.right,k);
        return flag;
    }

}
