package study;

/**
 * @author yanggq
 * @create 2022-04-16 17:08
 */
/*
* 请定义一个队列并实现函数 max_value 得到队列里的最大值，
* 要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
  若队列为空，pop_front 和 max_value 需要返回 -1
* */

import java.util.*;

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
public class Offer59 {
    /*
    * peek获取队列的值但是不删除
    * remove删除队列中的值
    *
    * */
    Queue<Integer> queue;
    Deque<Integer> deque;
    public Offer59(){
       queue=new LinkedList<>();
       deque=new LinkedList<>();
    }

    public int max_value() {
        if(deque.isEmpty())
            return -1;
        return deque.getFirst();
    }

    public void push_back(int value) {
//这里有问题
//        queue.offer(value);
//        if(deque.isEmpty())
//            deque.addFirst(value);
//        else {
//            if(value>deque.getFirst()) {
//                deque.addFirst(value);
//            }else if(value>deque.getLast()){
//                deque.removeLast();
//                deque.addLast(value);
//            }
//        }

        queue.offer(value);
        while(!deque.isEmpty() && deque.peekLast() < value)
            deque.pollLast();
        deque.offerLast(value);

    }

    public int pop_front() {
        if(queue.isEmpty()) return -1;
        if(queue.peek().equals(deque.peekFirst()))
            deque.pollFirst();
        return queue.poll();
    }

    public static void main(String[] args) {
        Offer59 offer59 = new Offer59();
        offer59.push_back(1);
        offer59.push_back(7);
        offer59.push_back(3);
        offer59.push_back(5);
        offer59.pop_front();
        offer59.pop_front();
        System.out.println(offer59.max_value());

    }
}

