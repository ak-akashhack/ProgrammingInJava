//**************** Multithreading Programm : using extends Thread  *****************************************

package com.Tech.java;

class thread1 extends Thread{
    public void run(){
        while (true){
            System.out.println("this is the akash rathod and there work is write a coding  : ");
        }
    }
}
class thread2 extends Thread{
    public void run(){
        while (true){
            System.out.println(" ak.akashHackeer  : ");
        }
    }
}
public class Multithreading_01 {
    public static void main(String[] args) {
        //        System.out.println("hello this is the akash : ");

        thread1 ak = new thread1();
        thread2 as = new thread2();

        ak.start();
        as.start();


    }
}