package com.Tech.Advance.Java;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_01 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(15);
        pq.offer(13);
        pq.offer(12);
        pq.offer(14);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
