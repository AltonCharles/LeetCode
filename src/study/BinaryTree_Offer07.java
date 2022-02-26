package study;

import java.util.HashMap;

/**
 * @author `
 * @create 2022-02-22 10:28
 */
public class BinaryTree_Offer07 {
    HashMap<Integer, Integer> map = new HashMap<>();
    int [] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return rebulid(0,0,inorder.length-1);
    }
    public TreeNode rebulid(int pre_root_index,int ino_left_index,int ino_right_index){
        //根据根节点建立Node
        if(ino_left_index>ino_right_index)
            return null;
        int ino_root_index=map.get(preorder[pre_root_index]);
        TreeNode rootNode = new TreeNode(preorder[pre_root_index]);
        //根节点，左边界，右边界
        rootNode.left=rebulid(pre_root_index+1,ino_left_index,ino_root_index-1);
        rootNode.right=rebulid(pre_root_index + ino_root_index - ino_left_index + 1,ino_root_index+1,ino_right_index);
        return rootNode;
    }

    public static void main(String[] args) {
        BinaryTree_Offer07 binaryTree_offer07 = new BinaryTree_Offer07();
        int [] pre={3,9,20,15,7};
        int [] ino={9,3,15,20,7};
        binaryTree_offer07.buildTree(pre,ino);
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}







