
// Addition of the n th natural number : 

package com.Tech.java;

import javax.crypto.BadPaddingException;
import java.util.Scanner;

public class Recursion_02 {

    public static int Addition_of_natural_number(int N,int first_number){

        if(N == 0){
            return 0;
        }

        return (first_number += Addition_of_natural_number(N-1, first_number + 1));

    }

    public static void main(String[] args) {

        System.out.println("enter the any one number : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int first_number = 1;

        int add = Addition_of_natural_number(N,first_number);

        System.out.println("Addition of the N th natural number : is : "+add);
//        int AdditionOfNnaturalNumber = 0;
//        for (int i=1;i<=N;i++){
//            AdditionOfNnaturalNumber += i ;
//        }
//        System.out.println(AdditionOfNnaturalNumber);

    }
}
