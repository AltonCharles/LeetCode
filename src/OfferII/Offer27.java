package OfferII;

/**
 * @author yanggq
 * @create 2022-05-28 19:36
 */
public class Offer27 {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)
            return true;
        ListNode preHead = new ListNode(0);
        preHead.next=head;
        //双指针，快慢指针
        ListNode quick,slow;
        quick=preHead;
        slow=preHead;

        while(slow.next!=null){
            quick=quick.next;
            if(slow.next.next!=null){
                slow=slow.next.next;
            }else {
                slow = slow.next;
            }
        }
        System.out.println("----------");
        //链表反转
        ListNode reveseHead=reveseList(quick.next);
        while (reveseHead!=null){
            if(head.val==reveseHead.val){
                head=head.next;
                reveseHead=reveseHead.next;
            }else {
                return false;
            }
        }
        return true;
    }

    public ListNode reveseList(ListNode head){
        ListNode next=null;
        ListNode now=null;
        ListNode pre=head;
        while (pre!=null){
            next=now;
            now=pre;
            pre=pre.next;
            now.next=next;
        }
        //反转后的头结点
        return now;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next=new ListNode(2);
        System.out.println(new Offer27().isPalindrome(node));
    }
}
