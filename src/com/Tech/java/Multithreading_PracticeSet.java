
// ********** Practice Problem 01 *****************************
  /*
  Write a program to print "good morning " and "welcome" continuasly on the
  screen in java using threads.
   */

package com.Tech.java;
class goodM extends Thread{
    public void run(){
        int i = 1;
        while (i<30000){
            System.out.println("Good Morning : ");
            i++;
        }
    }
}
class Wel extends Thread{
    public void run(){
        int i = 1;
        while (i<30000){
            System.out.println("WelCome : ");
            i++;
        }
    }
}
public class Multithreading_PracticeSet {
    public static void main(String[] args) {
//        System.out.println("hello akash : ");
        goodM g = new goodM();
        Wel w = new Wel();

        g.start();
        w.start();
    }
}



//  ********** Practice Problem 02 **************************************************************************

/*
        Add a step method in welcome thread of quastions 1 to dealay its
        Exicution of 200ms.
 */
//
//
//package com.Tech.java;
//class goodM extends Thread{
//    public void run(){
//        int i = 1;
//        while (i<30000){
//            System.out.println("Good Morning : ");
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            i++;
//        }
//    }
//}
//class Wel extends Thread{
//    public void run(){
//        int i = 1;
//        while (i<30000){
//            System.out.println("WelCome : ");
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            i++;
//        }
//    }
//}
//public class Multithreading_PracticeSet {
//    public static void main(String[] args) {
////        System.out.println("hello akash : ");
//        goodM g = new goodM();
//        Wel w = new Wel();
//
//        g.start();
//        w.start();
//    }
//}

//  ********** Practice Problem 03 **************************************************************************
/*
        Demonstate The getPriority() and setPriority() methods in java Threads.
 */
//
//package com.Tech.java;
//
//class GetSet extends Thread{
//    public void run(){
//        System.out.println("hello class : hello akash : hello hacker : ");
//    }
//}
//
//public class Multithreading_PracticeSet {
//    public static void main(String[] args) {
////        System.out.println("hello akash : ");
//
//    GetSet get = new GetSet();
//        get.setPriority(7);                     // setPriority
//        System.out.println(get.getPriority());      // getPriority
//    get.start();
//
//    }
//}


// ********** Practice Problem 04 **************************************************************************


/*
        How do you get reference to the current Thread in java ?
 */


//package com.Tech.java;
//
//class State extends Thread{
//    public void run(){
//        while (true){
//            System.out.println("hello class : ");
//        }
//    }
//}
//public class Multithreading_PracticeSet {
//    public static void main(String[] args) {
////        System.out.println("hello akash : ");
//        State ak = new State();
//        System.out.println(Thread.currentThread().getState());
//    }
//}