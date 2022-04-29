package OfferII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author yanggq
 * @create 2022-04-29 18:54
 */
/*给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
* */
public class Offer44 {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)
            return list;
        queue.offer(root);
        while (!queue.isEmpty()){
            int LMax=queue.peek().val;
            for(int i=queue.size();i>0;i--){
                TreeNode temp=queue.peek();
                LMax=Math.max(LMax,temp.val);
                queue.poll();
                if(temp.left!=null)
                    queue.offer(temp.left);
                if(temp.right!=null)
                    queue.offer(temp.right);
            }
            list.add(LMax);
        }
        return list;
    }
}
