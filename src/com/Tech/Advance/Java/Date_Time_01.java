package com.Tech.Advance.Java;

import java.util.Date;

public class Date_Time_01 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        Date ak = new Date();
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
//        System.out.println(ak);
//        System.out.println(ak);
        System.out.println(ak.getTime());
        System.out.println("years " + ak.getYear());
        System.out.println("month " + ak.getMonth());
        System.out.println("day " + ak.getDay());
        System.out.println("hours " + ak.getHours());
        System.out.println("Minutes " +ak.getMinutes());
        System.out.println("Second " + ak.getSeconds());



    }
}
