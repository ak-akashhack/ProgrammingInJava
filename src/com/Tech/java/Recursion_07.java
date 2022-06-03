
// Fibonancci Terms of the given index .

package com.Tech.java;

import java.util.Scanner;

public class Recursion_07 {

    public static int fibbonacci(int nth){

        if(nth == 0)
            return 0;

        if(nth == 1)
            return 1;

        int ans = fibbonacci(nth-1) + fibbonacci(nth-2);

        return ans;

    }

    public static void main(String[] args) {

//        System.out.println("hello akash : ");
        Scanner sc = new Scanner(System.in);
        int nth = sc.nextInt();

        System.out.println(fibbonacci(nth));

    }
}
