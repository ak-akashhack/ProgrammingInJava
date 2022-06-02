package com.Tech.java;

public class Recursion_11 {
   public static int y =0;

    public static void printx(String ak, int lenght){

        if(lenght == ak.length()-1){
            System.out.print(ak.charAt(lenght));
            for (int i = 0; i < 3; i++) {
                System.out.print('x');
            }

            return;
        }

        if(ak.charAt(lenght) == 'x'){
            y++;
        }
        else {
            System.out.print(ak.charAt(lenght));
        }

        printx(ak,lenght+1);

    }

    public static void main(String[] args) {
//        System.out.println("hello akash : ");
        String ak = "axbxcsxh";

        printx(ak,0);

    }
}


//
//
//package com.Tech.java;
//
//public class Recursion_11 {
//
//    public static void printx(String str,int index,int count,String newString){
//
//        if(index == str.length()-1){
//            for (int i = 0; i < count; i++) {
//                newString += 'x';
//            }
//            System.out.println(newString);
//            return;
//        }
//
//        if(str.charAt(index) == 'x'){
//            count++;
//            printx(str,index+1,count,newString);
//        }
//        else {
//            newString += str.charAt(index);
//            printx(str,index+1,count,newString);
//        }
//
//    }
//
//    public static void main(String[] args) {
////        System.out.println("hello akash : ");
//        String ak = "axxkdxxkdxxfxxd";
//        printx(ak,0,0,"");
//
//
//    }
//}
//

















