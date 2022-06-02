package com.Tech.java;

public class Recursion_12 {
    public static boolean[] map = new boolean[26];
    public static void removeduplicates(String str,int idex,String newString){

        if(idex == str.length()){
            System.out.println(newString);
            return;
        }

        char currentchar = str.charAt(idex);
        if (map[currentchar - 'a']){

            removeduplicates(str,idex+1,newString);
        }
        else {
            newString += currentchar;
            map[currentchar = 'a'] = true;
            removeduplicates(str,idex+1,newString);
        }
    }
    public static void main(String[] args) {
//        System.out.println("hello akash : ");

        String ak = "akkkasshh";
        removeduplicates(ak,0,"");
    }
}
