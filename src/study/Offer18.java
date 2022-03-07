package study;

/**
 * @author yanggq
 * @create 2022-03-07 18:34
 */

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 */
public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head==null)
            return null;
        if(head.val==val)
            return head.next;
        ListNode p=head;
        ListNode q=p.next;
        int temp;
        //不考虑其他特殊情况
        while (q!=null){
            temp=q.val;
            if(val==temp){
                p.next=q.next;
                q.next=null;

            }
            p=q;
            q=p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Offer18 offer18 = new Offer18();
        ListNode list = new ListNode(-3);
        list.next=new ListNode(5);
        list.next.next=new ListNode(-99);
        //list.next.next.next=new ListNode(9);
        System.out.println(offer18.deleteNode(list,-3));
    }

}
