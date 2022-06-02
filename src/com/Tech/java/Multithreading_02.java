// *************** Multithreading program : using runnable interface ***********************

package com.Tech.java;

class myThreadRunnable implements Runnable{
    public void run(){
        int i = 1;
        while (i<40000){
            System.out.println("this is the first Runnable implements : akash");

        }
    }
}

class myThreadRunnable2 implements Runnable{
    public void run(){
        int i = 1;
        while (i<40000){
            System.out.println("ak.akashHackeer : ");

        }
    }
}

public class Multithreading_02 {
    public static void main(String[] args) {
//        System.out.println("hello akash : ");
        myThreadRunnable bullets = new myThreadRunnable();
        myThreadRunnable2 bullets2 = new myThreadRunnable2();
        Thread gun = new Thread(bullets);
        Thread gun2 = new Thread(bullets2);

        gun.start();
        gun2.start();


    }
}
