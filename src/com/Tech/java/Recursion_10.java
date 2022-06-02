// Check if an array is sorted (Strictly Increasing)

package com.Tech.java;

public class Recursion_10 {

    public static boolean sorted(int arr[],int index){

       if(arr.length-1 == index){
           return true;
       }

        if(arr[index] >= arr[index+1]){
           return false;
        }
        else {
            return sorted(arr,index+1);
        }
    }

    public static void main(String[] args) {
//        System.out.println("hello akash : ");
        int arr[] = {1,2,4,4,5};

        System.out.println(sorted(arr,0));


    }
}
