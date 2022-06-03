
// conver number to word .

package com.Tech.java;

import com.sun.jdi.ArrayReference;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Recursion_08 {

    public static void showDigits(int givenNumber){

        String ak[] = {"zero" , "one" , "two","three","four","five","six","seven","eight","nine","ten"};

        if(givenNumber == 0){
            return;
        }
        int number = givenNumber%10;
        int secondnumber = givenNumber/10;
        showDigits(secondnumber);
        System.out.print(ak[number] + " ");
    }

    public static void main(String[] args) {
//        System.out.println("hello akash :");

        Scanner sc = new Scanner(System.in);
        int givenNumber = sc.nextInt();

        showDigits(givenNumber);



    }
}
