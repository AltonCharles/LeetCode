package study;

/**
 * @author yanggq
 * @create 2022-03-19 19:44
 */

import com.sun.org.apache.xerces.internal.xs.LSInputList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 */
public class Offer32 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> treeQueue = new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root!=null)
            treeQueue.add(root);
        TreeNode temp;
        //注意这里的判空条件
        while (!treeQueue.isEmpty()){
            List<Integer> row=new ArrayList<>();
            for(int i=treeQueue.size();i>0;i--){
                temp=treeQueue.poll();
                row.add(temp.val);
                if(temp.left!=null)
                    treeQueue.offer(temp.left);
                if(temp.right!=null)
                    treeQueue.offer(temp.right);
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        Offer32 offer32 = new Offer32();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        offer32.levelOrder(root);
    }
}
