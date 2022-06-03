
// print 5 to 1 in decreasing order .

package com.Tech.java;

public class Recursion_01 {
    public static void show(int N){
        System.out.println(N);
        if(N == 0){
            return;
        }
        show(N-1);

        System.out.println(N);
    }
    public static void main(String[] args) {
        System.out.println("this is the first recursion programmm : ");
        show(5);
    }
}
