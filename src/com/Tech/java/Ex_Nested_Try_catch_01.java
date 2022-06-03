// NESTED TRY CATCH :

package com.Tech.java;

import java.util.Scanner;

public class Ex_Nested_Try_catch_01 {
    public static void main(String[] args) {
//        System.out.println("hello akash : ");

        int mark[] = {11,22,33};

        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag){

            System.out.println("enter the value of the index : ");
            int end = sc.nextInt();

            try {
                System.out.println("welcome to my room : ");
                try {                                                               // NESTED TRY CATCH
                    System.out.println(mark[end]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("sorry this index does not exits : ");
                    System.out.println("Exception in second try");
                }
            }
            catch (Exception ex){
                System.out.println(ex);
            }

        }


    }
}
