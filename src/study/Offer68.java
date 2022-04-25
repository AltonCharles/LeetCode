package study;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yanggq
 * @create 2022-04-25 14:19
 */
/*
* 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。*/
public class Offer68 {
    Queue<TreeNode> queue1=new LinkedList<>();
    Queue<TreeNode> queue2=new LinkedList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //队列
        Queue<TreeNode> queueP;
        Queue<TreeNode> queueQ;
        queueP=selectNode(root,p,queue1);
        queueQ=selectNode(root,q,queue2);
        TreeNode temp=root;
        while (!queueP.isEmpty()&&!queueQ.isEmpty()&&queueP.peek()==queueQ.peek()){
            //求队列中相同部分的最大长度
            temp=queueP.poll();
            queueQ.poll();
        }
        return temp;
        //遍历p,q，记录下父节点

    }
    public Queue<TreeNode> selectNode(TreeNode root,TreeNode p,Queue<TreeNode> queue){
        //终止条件，root为空
//        if(root==null)
//            return queue1;
        if(root.val>p.val){
            //将节点添加到队列中
            //遍历左节点
            queue.offer(root);
            selectNode(root.left,p,queue);
        }
        if(root.val<p.val)
        {
            queue.offer(root);
            selectNode(root.right,p,queue);
        }
        if(root.val==p.val){
            queue.offer(root);
            return queue;
        }
        return queue;
    }
}

