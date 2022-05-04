package OfferII;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author yanggq
 * @create 2022-05-04 14:56
 */
/*
* 设计一个找到数据流中第 k 大元素的类（class）。
* 注意是排序后的第 k 大元素，不是第 k 个不同的元素。
请实现 KthLargest 类：
KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。
int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。
* */
/*   Queue
     Deque  PriorityQueue
     LinkList
     PriorityQueue通过堆实现，通过完全二叉树实现的小顶堆
     优先队列的作用是能保证每次取出的元素都是队列中权值最小的
*
* */
public class Offer59 {
    int k;
    PriorityQueue<Integer> queue=new PriorityQueue<>();

    public Offer59(int k, int[] nums) {
        this.k=k;
        for(int num:nums){
            queue.offer(num);
        }

    }

    public int add(int val) {
        queue.offer(val);
        while (queue.size()>k){
            queue.poll();
        }
        return queue.peek();
    }
}
