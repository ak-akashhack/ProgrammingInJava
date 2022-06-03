
// Fobbonaci serieas

package com.Tech.java;

import java.util.Scanner;

public class Recursion_03 {

    public static void fibonancci(int first_number,int second_number,int N){

        if(N==0){
            return;
        }
        int third_number = first_number + second_number;
        System.out.println(third_number);
//        first_number = second_number;
//        second_number = third_number;

        fibonancci(second_number,third_number,N-1);


    }

    public static void main(String[] args) {

        System.out.print("enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int first_number = 0 ;
        int second_number = 1;

        System.out.println(first_number);
        System.out.println(second_number);

       fibonancci(first_number,second_number,N-2);





    }
}
