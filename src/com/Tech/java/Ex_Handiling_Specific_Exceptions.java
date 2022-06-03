package com.Tech.java;

import java.util.Scanner;

public class Ex_Handiling_Specific_Exceptions {
    public static void main(String[] args) {
//        System.out.println("hello akash : ");

        int [] marks = {12,23,45};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index : ");
        int index = sc.nextInt();

        System.out.println("enter the number you want to divide the value with : ");
        int number = sc.nextInt();

        try {
            System.out.println("the value at array index intered is : " + marks[index]);
            System.out.println("the value of array-value/number is : " + marks[index]/number);
        }
        catch (ArithmeticException e){
            System.out.println("some ArithmeticException occured ! ");
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("some ArrayIndexOutOfBoundsException occured ! ");
            System.out.println(e);
        }

        catch (Exception e){
            System.out.println("some other occured ! ");
            System.out.println(e);
        }

    }
}
