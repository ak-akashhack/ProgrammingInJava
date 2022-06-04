package com.Tech.Advance.Java;

import java.util.ArrayDeque;

public class ArrayDequeuse_01 {
    public static void main(String[] args) {
//        System.out.println("hello akash : ");

        ArrayDeque<Integer> ak = new ArrayDeque<>();
        ak.add(12);
        ak.add(13);
        ak.add(14);
        ak.add(15);
        ak.addFirst(1);
        ak.addLast(9);
        System.out.println(ak);
        System.out.println(ak.getFirst());
        System.out.println(ak.getLast());



    }
}
