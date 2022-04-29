package OfferII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author yanggq
 * @create 2022-04-29 20:22
 */
/*
* 给定一个二叉树的 根节点 root，想象自己站在它的右侧，
* 按照从顶部到底部的顺序，返回从右侧所能看到的节点值
* */
public class Offer46 {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)
            return list;
        queue.offer(root);
        while (!queue.isEmpty()){
            for(int i=queue.size();i>0;i--){
                TreeNode temp=queue.peek();
                if(i==1)
                    list.add(temp.val);
                queue.poll();
                if(temp.left!=null)
                    queue.offer(temp.left);
                if(temp.right!=null)
                    queue.offer(temp.right);
            }
        }
        return list;
    }
}
