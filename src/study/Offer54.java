package study;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yanggq
 * @create 2022-04-27 14:08
 */
/*给定一棵二叉搜索树，请找出其中第 k 大的节点的值
* */
public class Offer54 {
    //key为下标，value为二叉树结点值
    Map<Integer,Integer> map=new HashMap<>();
    int i=1;
    public int kthLargest(TreeNode root, int k) {
        //将二叉搜索树排序
        //从大到小排序
        return sortTree(root).get(k);

    }

    public Map<Integer,Integer> sortTree(TreeNode root){
        //终止条件：结点为空
        //递归：右，根，左
        if(root==null)
            return null;
        sortTree(root.right);
        map.put(i,root.val);
        ++i;
        sortTree(root.left);
        return map;
    }
}
