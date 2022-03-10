package study;

/**
 * @author yanggq
 * @create 2022-03-09 20:04
 */

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 */
public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //以l1作为合并后的链表
        //在前面设置头结点
        ListNode head;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.val<l2.val){
            head=l1;
        }else {
            head=l2;
        }

        while (l1!=null||l2!=null){
            ListNode l1left=null;
            ListNode l2left;
            while (l1!=null){
                if(l2==null)
                    return head;
                if(l1.val<l2.val)
                {
                    l1left=l1;
                    l1=l1.next;
                    continue;
                }
                l2left=l2;
                l2=l2.next;

                //将结点插入
                l2left.next=l1;
                if(l1left==null)
                {
                    l1left=l2left;
                    l1left.next=l1;
                }

                else{
                    l1left.next=l2left;
                    l1left=l2left;
                }

            }
            l1left.next=l2;
            return head;
        }
        return head;

    }
//递归
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dummyHead = new ListNode(-1), pre = dummyHead;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                pre.next = l1;
//                pre = pre.next;
//                l1 = l1.next;
//            } else {
//                pre.next = l2;
//                pre = pre.next;
//                l2 = l2.next;
//            }
//        }
//        if (l1 != null) {
//            pre.next = l1;
//        }
//        if (l2 != null) {
//            pre.next = l2;
//        }
//
//        return dummyHead.next;
//    }


//递归
//public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//    if (l1 == null) {
//        return l2;
//    }
//    if (l2 == null) {
//        return l1;
//    }
//    if (l1.val <= l2.val) {
//        l1.next = mergeTwoLists(l1.next, l2);
//        return l1;
//    } else {
//        l2.next = mergeTwoLists(l1, l2.next);
//        return l2;
//    }
//}

    public static void main(String[] args) {
        Offer25 offer25 = new Offer25();
        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next=new ListNode(3);
//        l2.next.next=new ListNode(4);

        ListNode test=offer25.mergeTwoLists(l1,l2);
    }
}
