package study;

/**
 * @author yanggq
 * @create 2022-02-12 18:47
 */

import javax.xml.soap.Node;

/**
 * 将单链表反转
 */
public class exchageNode {
    public ListNode reverseNdoe(ListNode head){
        //如果不改变原来的结点，需要3个指针
        //使用head结点的化需要2个指针
        if(head==null||head.next==null)
            return head;
        ListNode pre=null;
        ListNode curren=head;
        ListNode next=null;
        while(curren!=null){
            next=curren.next;
            curren.next=pre;
            pre=curren;
            if(next==null)
                return curren;
            curren=next;
        }
        return curren;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        exchageNode exchageNode = new exchageNode();
        exchageNode.reverseNdoe(node);
    }
}

