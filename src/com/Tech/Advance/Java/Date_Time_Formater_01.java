package com.Tech.Advance.Java;

import com.sun.jdi.InconsistentDebugInfoException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formater_01 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String Mydate = dt.format(df);
        System.out.println(Mydate);


    }
}
