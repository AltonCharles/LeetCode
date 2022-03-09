package study;

/**
 * @author yanggq
 * @create 2022-03-08 21:01
 */

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        //排除特殊情况
//        if(head==null||head.next==null)
//            return head;
        ListNode after=null,now=null,pre=head;
        while (pre!=null){
            after=now;
            now=pre;
            pre=pre.next;
            now.next=after;
        }
        return now;
    }

    //递归实现，可以好好考虑一下
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        Offer24 offer24 = new Offer24();
        offer24.reverseList2(node);

    }
}
