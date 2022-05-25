package OfferII;

import com.sun.imageio.spi.RAFImageInputStreamSpi;

import java.util.HashMap;

/**
 * @author yanggq
 * @create 2022-05-25 19:29
 */
/*
*给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
* */
public class Offer21
{
    //双指针
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(0, head);
        ListNode first=preHead;
        ListNode second=preHead;
        for (int i = 0; i <= n; i++) {
            first=first.next;
        }
        while (first!=null){
            first= first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return  preHead.next;
    }
}
