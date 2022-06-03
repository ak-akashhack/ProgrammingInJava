
// **************** Practice Problem 01 *************************************************************

// Write a java program to demonstrate syntax , logical and runtime error :

package com.Tech.java;

public class Ex_Practice_Sets_01 {
    public static void main(String[] args) {
        System.out.println("hello class : ");

//        _________________________ SYNTAX ERROR ______________________________

//        int a = 100                  //  <==
//        System.out.println(a);

//        _______________________ LOGICAL ERROR ______________________________

//        int a = 100;
//        int b = 200;

//        System.out.println("Addition of two Number : " + (a-b));    // <==

//        _______________________ RUNTIME ERROR _____________________________
//
//        int a = 20;
//        int b = 0;
//        System.out.println("Division of a/b = " + (a/b));

    }
}


// **************** Practice Problem 02 *************************************************************
// Write a java program that print "HaHa" during Arithmatic Exception and "HeHe" during an Illegal argument Exception
//
//package com.Tech.java;
//
//public class Ex_Practice_Sets_01 {
//    public static void main(String[] args) {
////        System.out.println("hello akash : ");
//
//        try {
//            int a = 666/0;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("HaHa");
//        }
//        catch (ArithmeticException ex){
//            System.out.println("HeHe");
//        }
//
//    }
//}



// **************** Practice Problem 03 *************************************************************
// Write a program that allows you to keep accessing an array until a valid index is given if max retries exied 5 print "error"

//package com.Tech.java;
//
//import java.util.Scanner;
//
//public class Ex_Practice_Sets_01 {
//    public static void main(String[] args) {
//        System.out.println("hello akash : ");
//
//
//        boolean flag = true;
//        int mark [] = {11,22,33};
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i = 0;
//        while (flag && i<5){
//            try {
//                System.out.println("enter the value of index : ");
//                index = sc.nextInt();
//                System.out.println("the value of marks[index] is " + mark[index]);
//                break;
//            }
//            catch (Exception e){
//                System.out.println("invalid index : ");
//                i++;
//            }
//        }
//        if(i>=5){
//            System.out.println("error");
//        }
//
//
//    }
//}


// **************** Practice Problem 04 *************************************************************
// Modify program in Q. 3 to throw a costum Excaption if

//package com.Tech.java;
















