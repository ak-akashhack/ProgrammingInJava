//// Throw and Throws

package com.Tech.java;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Ex_Throw_Throws_01 {

    public static int divide(int a,int b)throws ArithmeticException {
        return a/b;
    }

    public static void main(String[] args){
//        System.out.println("hello akash : ");

        int a = 2;
        int b;
        System.out.println("enter the second value : ");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();

        try {
            System.out.println(divide(a,b));
        }
        catch (Exception ex){
            System.out.println("Exception : happen");
            System.out.println(ex);
        }


    }
}

//
//package com.Tech.java;
//
//class MyEx extends Exception{
//    public String toString(){
//        return "Radius cannot be negative : ";
//    }
//
//    public String getMessage(){
//        return "Radius cannot be negative : ";
//    }
//}
//
//public class Ex_Throw_Throws_01 {
//
//    public static double area(int r) throws MyEx{
//        if(r<0){
//            throw new MyEx();
//        }
//
//        double result = Math.PI * r * r;
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("hello class : ");
//
//        int r = -1;
//
//        try {
//            System.out.println(area(r));
//        }
//        catch (Exception ex){
//            System.out.println("hello :");
//        }
//
//
//
//    }
//}