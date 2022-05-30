package OfferII;

import com.sun.org.apache.xerces.internal.xs.ShortList;

/**
 * @author yanggq
 * @create 2022-05-30 20:35
 */
public class Offer77 {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;

        ListNode mid=middleList(head);
        ListNode rightHead=mid.next;
        mid.next=null;

        ListNode left=sortList(head);
        ListNode right=sortList(rightHead);

        return mergeList(left,right);
    }


    //寻找链表中点
    public ListNode middleList(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode firstNode=head;
        ListNode lastNode=head.next.next;
        while (lastNode!=null&&lastNode.next!=null){
            firstNode=firstNode.next;
            lastNode=lastNode.next;
        }
        return firstNode;
    }

    //合并两个有序链表
    public ListNode mergeList(ListNode L1,ListNode L2){
        ListNode preHead=new ListNode(-1);
        ListNode cur=preHead;
        while (L1!=null&&L2!=null){
            if(L1.val<L2.val){
                cur.next=L1;
                L1=L1.next;
            }else {
                cur.next=L2;
                L2=L2.next;
            }
            cur=cur.next;
        }
        cur.next=L1!=null?L1:L2;
        return preHead.next;
    }


    public static void main(String[] args) {
        ListNode L1 = new ListNode(1);
        L1.next=new ListNode(3);
        ListNode L2=new ListNode(2);
        L2.next=new ListNode(4);
        Offer77 offer77 = new Offer77();
//        ListNode mid=offer77.middleList(L1);
//        System.out.println(mid);
        ListNode listNode = offer77.mergeList(L1, L2);
        System.out.println(listNode);

    }
}
