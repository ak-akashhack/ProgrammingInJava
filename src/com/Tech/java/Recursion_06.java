
// Find The Fist occurance and last occurance in the given String

package com.Tech.java;

public class Recursion_06 {

    public static int first;
    public static int last;
    public static void show(String ak,int index,char same){

       if(index == ak.length()-1){
           System.out.println(first);
           System.out.println(last);
           return;
       }

       if(same == ak.charAt(index)){
           if(first == 0){
               first = index;
           }
           else {
               last = index;
           }
       }

       show(ak,index+1,same);

    }

    public static void main(String[] args) {

        String ak = "haackeaar";
        char same = 'a';


        show(ak,0,same);

    }
}


//*************************************
//
//package com.Tech.java;
//
//public class Recursion_06 {
//
//    public static int first = -1;
//    public static int last = -1;
//    public static String show(String ak,int lenght,char same){
//
//        if (lenght == 0){
//            return "";
//        }
//
//        if(same == ak.charAt(lenght)){
//            if(last == -1){
//                last = lenght;
//            }
//            else {
//                first = lenght;
//            }
//
//        }
//        show(ak,lenght-1,same);
//        String index = "first occurance at a " + first + " index and " + "last occurance at a " + last + " index" ;
//        return index;
//
//    }
//
//    public static void main(String[] args) {
//
//        String ak = "h3321321aackeaar";
//        char same = 'a';
//        int lenght = ak.length()-1;
//
//        System.out.println(show(ak,lenght,same));
//
//    }
//}
