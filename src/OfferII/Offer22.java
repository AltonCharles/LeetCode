package OfferII;

import java.util.HashSet;

/**
 * @author yanggq
 * @create 2022-05-25 20:40
 */
/*
* 给定一个链表，返回链表开始入环的第一个节点。
* 从链表的头节点开始沿着 next 指针进入环的第一个节点为环的入口节点。
* 如果链表无环，则返回 null。
* 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
* 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，
* 并不会作为参数传递到函数中。
* */
public class Offer22 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp=head;
        while (temp!=null){
            if(set.contains(temp))
                return temp;
            set.add(temp);
            temp=temp.next;
        }
        return null;
    }
}
