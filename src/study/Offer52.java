package study;

/**
 * @author yanggq
 * @create 2022-04-10 14:24
 */
/*
* 方法非常的巧妙，A与B遍历完自己后在遍历对方的
* */
public class Offer52 {
    public MyListNode getIntersectionNode(MyListNode headA, MyListNode headB) {
        MyListNode A=headA,B=headB;
        while (A!=B){
            A=A==null?headB:A.next;
            B=B==null?headA:B.next;
        }
        return A;
    }

}

class MyListNode {
      int val;
      MyListNode next;
      MyListNode(int x) {
         val = x;
         next = null;
     }
  }
