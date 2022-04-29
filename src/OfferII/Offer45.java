package OfferII;

import com.sun.media.jfxmedia.events.PlayerStateListener;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yanggq
 * @create 2022-04-29 19:50
 */
/*给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
假设二叉树中至少有一个节点。
 * */
public class Offer45 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> layerList = null;
        //层数
        int layer=-1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            layerList = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode temp = queue.peek();
                layerList.add(temp.val);
                queue.poll();
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
            }
            list.add(layerList);
            ++layer;
        }
        System.out.println(list);
        return list.get(layer).get(0);
    }

    public static void main(String[] args) {
        Offer45 offer45 = new Offer45();
        TreeNode treeNode = new TreeNode(2);
        treeNode.left=new TreeNode(1);
        treeNode.right=new TreeNode(3);
        System.out.println(offer45.findBottomLeftValue(treeNode));


    }
}
