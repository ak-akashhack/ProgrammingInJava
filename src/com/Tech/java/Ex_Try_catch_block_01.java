package com.Tech.java;

class MyExceptionx extends Exception{
    public String toString(){
        return "becouse b is 0 : cannot divide by zero : ";
    }
    public String getMessage(){
        return " b is 0 : cannot divide by zero : ";
    }
};


public class Ex_Try_catch_block_01 {
    public static void main(String[] args) throws MyExceptionx {

//        Type of Exception:

//        1) NullPointerException
//        2) ArithmeticException
//        3) ArrayIndexOutOfBoundsException
//        4) IllegalArgumentException
//        5) NameNotFoundException


//***************** Try_catch_block *************************


        int a = 50000;
        int b = 0;
        int c ;
        if(b == 0){
            throw new MyExceptionx();
        }
        else {
            c = a/b;
            System.out.println(c);
        }



//        try {
//            int c = a/b;
//            System.out.println("The result is : " + c);
//        }
//        catch (Exception arr){
//            System.out.println("we failed to divide reasion : ");
//            System.out.println(arr);
//        }



    }
}
