package com.Tech.Advance.Java;

import java.util.ArrayDeque;

public class ArrayDequeuse_01 {
    public static void main(String[] args) {
//        System.out.println("hello akash : ");

        ArrayDeque<Integer> ak = new ArrayDeque<>();
//        ak.add(12);
//        ak.add(13);
//        ak.add(14);
//        ak.add(15);
//        ak.addFirst(1);
//        ak.addLast(9);
//        System.out.println(ak);
//        System.out.println(ak.getFirst());
//        System.out.println(ak.getLast());
//

        ak.offer(11);
        ak.offer(12);
        ak.offer(13);
        ak.offer(14);

        System.out.println(ak);

        System.out.println(ak.peek());
        System.out.println(ak.poll());
        System.out.println(ak);

        System.out.println("peekFirst : " + ak.peekFirst());
        System.out.println("peekLast : " + ak.peekLast());

        System.out.println(ak.pollFirst());
        System.out.println(ak.pollLast());

        System.out.println(ak);



    }
}
