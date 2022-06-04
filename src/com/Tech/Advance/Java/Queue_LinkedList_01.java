package com.Tech.Advance.Java;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList_01 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");

        // Queue function :
        // add()
        // offer()
        // element ()
        // peek()
        // remove()
        // poll()


        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue.peek());


    }
}
