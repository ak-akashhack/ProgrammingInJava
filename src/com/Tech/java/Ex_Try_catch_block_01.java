package com.Tech.java;

public class Ex_Try_catch_block_01 {
    public static void main(String[] args) {

//        Type of Exception:

//        1) NullPointerException
//        2) ArithmeticException
//        3) ArrayIndexOutOfBoundsException
//        4) IllegalArgumentException
//        5) NameNotFoundException


//***************** Try_catch_block *************************


        int a = 50000;
        int b = 0;

        try {
            int c = a/b;
            System.out.println("The result is : " + c);
        }
        catch (Exception arr){
            System.out.println("we failed to divide reasion : ");
            System.out.println(arr);
        }



    }
}
