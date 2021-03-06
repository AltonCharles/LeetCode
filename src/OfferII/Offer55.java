package OfferII;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yanggq
 * @create 2022-05-04 15:21
 */
/*
* 实现一个二叉搜索树迭代器类BSTIterator ，表示一个按中序遍历二叉搜索树（BST）的迭代器：
BSTIterator(TreeNode root) 初始化 BSTIterator 类的一个对象。BST 的根节点 root 会作为构造函数的一部分给出。
* 指针应初始化为一个不存在于 BST 中的数字，且该数字小于 BST 中的任何元素。
boolean hasNext() 如果向指针右侧遍历存在数字，则返回 true ；否则返回 false 。
int next()将指针向右移动，然后返回指针处的数字
* */
public class Offer55 {
    Queue<TreeNode> queue=new LinkedList<>();
    public Offer55(TreeNode root) {
        addQueue(root);

    }
    public void addQueue(TreeNode root){
        if(root==null)
            return;
        addQueue(root.left);
        queue.offer(root);
        addQueue(root.right);

    }

    public int next() {
        int val=-1;
        if(!queue.isEmpty()){
            val=queue.poll().val;
        }
        return val;
    }

    public boolean hasNext() {
        return queue.isEmpty()==true?false:true;
    }

    public static void main(String[] args) {
        TreeNode root=StaticTestTree.creBSTree();
        Offer55 offer55 = new Offer55(root);
        offer55.next();

    }
}
