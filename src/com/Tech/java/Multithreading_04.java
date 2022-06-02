// ************** Threas Priorities ***************

package com.Tech.java;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("Thanks You " + getName());
        }
    }
}
public class Multithreading_04 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");

        MyThr ak1 = new MyThr("Akash01");
        MyThr ak2 = new MyThr("Akash02");
        MyThr ak3 = new MyThr("Akash03");
        MyThr ak4 = new MyThr("Akash04");
        MyThr ak5 = new MyThr("Akash05");
        MyThr ak6 = new MyThr("Akash06 (Most importance");
        ak6.setPriority(Thread.MAX_PRIORITY);
        ak1.setPriority(Thread.MIN_PRIORITY);
        ak2.setPriority(Thread.MIN_PRIORITY);
        ak3.setPriority(Thread.MIN_PRIORITY);
        ak4.setPriority(Thread.MIN_PRIORITY);
        ak5.setPriority(Thread.MIN_PRIORITY);

        ak1.start();
        ak2.start();
        ak3.start();
        ak4.start();
        ak5.start();
        ak6.start();

    }
}
