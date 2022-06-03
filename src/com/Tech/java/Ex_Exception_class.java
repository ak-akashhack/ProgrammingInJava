package com.Tech.java;

import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        return "I am to String()";
    }

    public String getMessage() {
        return "I am getMessage()";
    }

}
//___________________________________________________________________________

public class Ex_Exception_class {
    public static void main(String[] args) {
        System.out.println("hello akash : ");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try {
                throw new  MyException();
//                throw new ArithmeticException("this is the arithmaticException : ");
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.println(ex);
                ex.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes finished : ");
        }
    }
}
