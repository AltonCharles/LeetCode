package study;

/**
 * @author yanggq
 * @create 2022-03-08 20:32
 */

/**
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 *
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 */
public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        //直接遍历
        ListNode pre=head;
        int count=0;
        while (pre!=null){
            pre=pre.next;
            ++count;
        }

        int n=count-k;
        if(n<0)
            return null;
        for (int i = 0; i <n; i++) {
            head=head.next;
        }
        return head;

    }
//快慢指针，想法太好了
//    ListNode frontNode = head, behindNode = head;
//        while (frontNode != null && k > 0) {
//
//        frontNode = frontNode.next;
//        k--;
//    }
//
//        while (frontNode != null) {
//
//        frontNode = frontNode.next;
//        behindNode = behindNode.next;
//    }
//
//        return behindNode;
}
