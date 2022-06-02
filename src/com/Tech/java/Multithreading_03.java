// ******* Threads constructor ***********

package com.Tech.java;

class Mythread extends Thread{

    public Mythread(String name){
        super(name);
    }
    public void run(){
            System.out.println("i am a Thread : ");
    }
}

public class Multithreading_03 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");
        Mythread ak = new Mythread("Akash");
        ak.start();
        System.out.println("The Id of the thread is : "+ak.getId());
        System.out.println("The Name of the thread is : "+ak.getName());
    }
}
