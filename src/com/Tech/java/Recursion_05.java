package com.Tech.java;

public class Recursion_05 {

    public static void reverse(String ak , int lenght){

        if(lenght == 0){
            System.out.println(ak.charAt(lenght));
            return;
        }

        System.out.println(ak.charAt(lenght));
        reverse(ak,lenght-1);
    }

    public static void main(String[] args) {

        String ak = "akash";

        int lenght = ak.length()-1;
        reverse(ak,lenght);

    }
}


//
//
//package com.Tech.java;
//
//import java.util.Scanner;
//
//public class Recursion_05 {
//
//    public static void reverse(String str , int lenght){
//
//        if (lenght == 0) {
//            System.out.println(str.charAt(lenght));
//            return;
//        }
//
//        char lastCharacter = str.charAt(lenght);
//        System.out.print(lastCharacter);
//        reverse(str,lenght-1);
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("hello akash : ");
//
//        System.out.println("enter the Valid String : ");
//        Scanner sc = new Scanner(System.in);
//        String ak = sc.nextLine();
//
//        int length = ak.length()-1;
//
//        reverse(ak,length);
//
//
//    }
//
//
//}































