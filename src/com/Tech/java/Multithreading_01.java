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


//package com.Tech.java;
//
//class akash extends Thread {
//    void show(){
//        System.out.println("This is the show function : ");
//    }
//    public void run(){
//        while (true){
//            System.out.println("This is the run function : ");
//        }
//    }
//}
//public class Multithreading_01 {
//    public static void main(String[] args) {
////        System.out.println("hello akash : ");
//        akash ak = new akash();
//        ak.show();
//        ak.start();
//
//
//
//    }
//}



//************** EXAMPLE OF THE THREAD ***********


//package com.Tech.java;
//
//class akash extends Thread{
//    public void show(){
//        System.out.println("this is the function show : ");
//    }
//
//    public void run(){
//        while (true){
//            System.out.println("this is the function run : ");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//
//class akashh extends Thread{
//    public void show(){
//        System.out.println("this is the function show : ");
//    }
//
//    public void run(){
//        while (true){
//            System.out.println("Hello hacker : ");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//
//class akashhh extends Thread{
//    public void show(){
//        System.out.println("this is the function show : ");
//    }
//
//    public void run(){
//        while (true){
//            System.out.println("1 ");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//public class Multithreading_01 {
//    public static void main(String[] args) {
//        System.out.println("hello akash : ");
//
//        akash ak = new akash();
//        akashh akk = new akashh();
//        akashhh akkk = new akashhh();
//        ak.show();
//        akk.show();
//        ak.start();
//        akk.start();
//        akkk.start();
//
//    }
//}
//
//













