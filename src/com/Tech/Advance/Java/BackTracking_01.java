package com.Tech.Advance.Java;

public class BackTracking_01 {
    public static void printPermutation(String str, String perm, int idx){

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            char newStr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newStr,perm,idx+1);
        }

    }
    public static void main(String[] args) {
        System.out.println("hello class : ");

        String ak = "ABC";




    }
}
