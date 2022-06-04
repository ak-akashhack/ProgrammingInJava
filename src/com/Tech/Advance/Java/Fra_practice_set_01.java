package com.Tech.Advance.Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.CancellationException;
import java.util.logging.Formatter;

public class Fra_practice_set_01 {
    public static void main(String[] args) {
        System.out.println("hello class : ");

//        ******************** Practice Problem 01 ***************************

        ArrayList<String> StudentName = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        StudentName.add("akash");
        StudentName.add("yogesh");
        StudentName.add("pralhad");
        StudentName.add("sajan");
        StudentName.add("badal");
        StudentName.add("ganesh");
        StudentName.add("lahu");
        StudentName.add("rahul");
        StudentName.add("atul");
        StudentName.add("lucky");

        for (String element : StudentName ) {
            System.out.println(element);
        }

//        ******************** Practice Problem 02 ***************************

//        HashSet<Integer> Number = new HashSet<>();
//
//        Number.add(11);
//        Number.add(22);
//        Number.add(33);
//        Number.add(44);
//        Number.add(11);
//
//        System.out.println(Number);

//        ******************** Practice Problem 03 ***************************

//        Date date = new Date();
//
//        System.out.println((date.getHours()-12) + " : " + date.getMinutes() + " : " + date.getSeconds());

//        ******************** Practice Problem 04 ***************************

//        Calendar c = Calendar.getInstance();

//        System.out.println(c.getTime().getHours() - 12 + " : " + c.getTime().getMinutes() + " : " + c.getTime().getSeconds());

//        ******************** Practice Problem 04 ***************************

//        LocalDateTime ldt = LocalDateTime.now();
//
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("h-m-s");
//
//        String mydate = ldt.format(df);
//
//        System.out.println(mydate);


    }
}
