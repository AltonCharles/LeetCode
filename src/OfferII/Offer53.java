package OfferII;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author yanggq
 * @create 2022-05-02 20:49
 */
/*
* 给定一棵二叉搜索树和其中的一个节点 p ，
* 找到该节点在树中的中序后继。如果节点没有中序后继，请返回 null 。
  节点 p 的后继是值比 p.val 大的节点中键值最小的节点，
* 即按中序遍历的顺序节点 p 的下一个节点。
* */
public class Offer53 {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode cur=root;
        TreeNode result=null;
        while (cur!=null){
            if(cur.val>p.val){
                result=cur;
                cur=cur.left;
            }else if(cur.val<p.val){
                cur=cur.right;
                result=cur.right;
            }else {
                //return cur.right;
                return result;
            }
        }
        return result;
    }
}
