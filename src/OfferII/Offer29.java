package OfferII;

/**
 * @author yanggq
 * @create 2022-05-31 19:41
 */
public class Offer29 {
    public Node insert(Node head, int insertVal) {
        if(head==null)
        {
            head=new Node(insertVal);
            head.next=head;
            return head;
        }
        //链表中值最大的结点
        Node max=findeMaxNode(head);
        if(insertVal>=max.val)
        {
            Node node = new Node(insertVal);
            node.next=max.next;
            max.next=node;
            return head;
        }else {
            Node cur=max;
            Node curnext=max.next;
            while (cur!=curnext){
                if(insertVal<=curnext.val){
                    Node node = new Node(insertVal);
                    node.next=curnext;
                    cur.next=node;
                    return head;
                }

                cur=cur.next;
                curnext=cur.next;
            }
            //出现cur=curnext的情况为只有一个结点的循环链表
            Node node=new Node(insertVal);
            cur.next=node;
            node.next=cur;

        }
        return head;

    }

    //寻找循环链表的最大结点
    public Node findeMaxNode(Node head){
        if(head.next==head)
            return head;
        Node max=head;
        Node cur=head.next;
        while (cur!=head){
            if(cur.val>=max.val){
                max=cur;
            }
            cur=cur.next;
        }
        return max;
    }


    public static void main(String[] args) {
        Node node = new Node(1);
        node.next=new Node(3);
        node.next.next=new Node(5);
        node.next.next.next=node;
        System.out.println(new Offer29().insert(node,4));
    }
}

