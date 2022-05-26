package OfferII;

/**
 * @author yanggq
 * @create 2022-05-26 19:48
 */
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        ListNode next=null;
        ListNode cur=null;
        ListNode pre=head;
        while (pre!=null){
            next=cur;
            cur=pre;
            pre=pre.next;
            cur.next=next;
        }
        return cur;
    }
}
