
// n to the pawer of x

package com.Tech.java;

public class Recursion_04 {

    public static int show(int x,int n){

        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        if (n%2==0){
            return show(x,n/4) * show(x,n/4) * show(x,n/4) * show(x,n/4);
        }else {
            return show(x,n/2) * show(x,n/2) * x;

        }


    }

    public static void main(String[] args) {
        /*
           example :            x = 2;           n = 3;           x * x * x

         */
           int x = 2;
           int n = 6;
        System.out.println(show(x,n));
    }
}
