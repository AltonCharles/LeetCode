package OfferII;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yanggq
 * @create 2022-04-27 14:48
 */
/*完全二叉树是每一层（除最后一层外）都是完全填充（即，节点数达到最大，第 n 层有 2n-1 个节点）的，
并且所有的节点都尽可能地集中在左侧。
设计一个用完全二叉树初始化的数据结构 CBTInserter，它支持以下几种操作：
CBTInserter(TreeNode root) 使用根节点为 root 的给定树初始化该数据结构；
CBTInserter.insert(int v)  向树中插入一个新节点，节点类型为 TreeNode，值为 v 。
使树保持完全二叉树的状态，并返回插入的新节点的父节点的值；
CBTInserter.get_root() 将返回树的根节点
* */
public class Offer43 {
    TreeNode root;
    Queue<TreeNode> queue=new LinkedList<>();
    public Offer43(TreeNode root) {
        this.root=root;
        queue.offer(root);
    }
    //插入一个新结点，返回父节点的值
    public int insert(int v) {
        TreeNode temp;
        while (!queue.isEmpty()){
            if(queue.peek().left!=null&&queue.peek().right!=null){
                queue.offer(queue.peek().left);
                queue.offer(queue.peek().right);
                queue.poll();
                continue;
            }
            temp=new TreeNode(v);
            if(queue.peek().left==null){
               queue.peek().left=temp;
               queue.offer(temp);
               return queue.peek().val;
            }
            //左结点非空，入队
            queue.offer(queue.peek().left);
            if(queue.peek().right==null){
                queue.peek().right=temp;
                queue.offer(temp);
                return queue.peek().val;
            }
        }
        return v;
    }
    //返回树的根节点
    public TreeNode get_root() {
        return root;
    }

}
