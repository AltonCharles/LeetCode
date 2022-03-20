package study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author yanggq
 * @create 2022-03-20 11:09
 */
public class Offer32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> treeQueue = new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root!=null)
            treeQueue.add(root);
        TreeNode temp;
        //注意这里的判空条件
        while (!treeQueue.isEmpty()){
            LinkedList<Integer> row=new LinkedList<>();
            for(int i=treeQueue.size();i>0;i--){
                temp=treeQueue.poll();
//                row.add(temp.val);
                if(result.size()%2==0)
                    row.addLast(temp.val);
                else
                    row.addFirst(temp.val);

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
        Offer32_2 offer32 = new Offer32_2();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        offer32.levelOrder(root);
    }
}
