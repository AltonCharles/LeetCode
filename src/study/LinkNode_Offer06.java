package study;

/**
 * @author yanggq
 * @create 2022-02-12 10:53
 */

import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class LinkNode_Offer06 {
    public int[] reversePrint(ListNode head) {
       //栈实现
        Stack<ListNode> stack = new Stack<>();
        int size=0;
        while (head!=null){
            stack.push(head);
            head=head.next;
            ++size;
        }
        int [] temp=new int[size];
        int i=0;
        while (!stack.isEmpty()){
            temp[i++]=stack.pop().val;
        }
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        LinkNode_Offer06 linkNode_offer06 = new LinkNode_Offer06();
        for (int i = 0; i < 3; i++) {
            System.out.println( linkNode_offer06.reversePrint(head)[i]);
        }
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
