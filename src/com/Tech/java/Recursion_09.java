package com.Tech.java;

public class Recursion_09 {

    public static int goHome(long nstairs){

        if(nstairs<0){
            return 0;
        }
        if (nstairs== 0){
            return 1;
        }

        int ans = goHome(nstairs-1)+ goHome(nstairs-2);
        return ans;


    }

    public static void main(String[] args) {
//        System.out.println("hello akash : ");

        System.out.println(goHome(5));


    }
}
