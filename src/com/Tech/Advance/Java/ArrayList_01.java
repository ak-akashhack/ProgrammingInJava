package com.Tech.Advance.Java;


import javax.print.DocFlavor;
import java.util.ArrayList;

public class ArrayList_01 {
    public static void main(String[] args) {
//        System.out.println("hello akash : ");

        ArrayList<Integer> ak = new ArrayList<>();
        ArrayList<Integer> as = new ArrayList<>();
        as.add(111);
        as.add(155);
        as.add(144);
        as.add(133);
        as.add(122);


        ak.add(6);
        ak.add(4);
        ak.add(7);
        ak.add(1,10);
        ak.add(3,20);
        ak.addAll(0,as);

        System.out.println(ak.contains(7));
        System.out.println(ak.indexOf(7));
        System.out.println(ak.remove(1));
        ak.set(1,222);

//        ak.clear();

//        System.out.println(ak);

        for (int i = 0; i < ak.size(); i++) {
            System.out.print(ak.get(i));
            System.out.print(" ");
        }

    }
}
