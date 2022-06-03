// ****************** Multithreading program : Thread Methods *****************************
// try : catch : join() :
package com.Tech.java;

class sagar extends Thread{
    public void run(){
        int i = 1;
        while (true){
            System.out.println("Thanks You : Akash : ");

            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class sagarr extends Thread{
    public void run(){
        int i = 1;
        while (i<=30000){
            System.out.println("Thanks You : Sagar  : ");
            i++;
        }
    }
}
public class Multithreading_05 {
    public static void main(String[] args) {
//        System.out.println("hello akash :");
     sagar sa = new sagar();
     sagarr saa = new sagarr();
     saa.start();

     try {
         saa.join();
     }
     catch (Exception ar){
         System.out.println(ar);
     }

     sa.start();

    }
}
