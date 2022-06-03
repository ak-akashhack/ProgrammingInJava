// finally block :

package com.Tech.java;

public class Ex_Finally_Block {

    public static int great(){
        try{
            int a = 2;
            int b = 1;
            int c = a/b;
            return c;
        }
        catch (Exception ex){
            System.out.println("Exception : ");
        }

        finally {
            System.out.println("this is the finally function : ");
        }

        return 9;

    }

    public static void main(String[] args) {
//        System.out.println("hello class : ");

//        great();
//        System.out.println(great());


        int a =7;
        int b =9;
        while (true){
            try {
                System.out.println(a/b);

            }
            catch (Exception ex){
                System.out.println(ex);
                break;
            }
            finally {
                System.out.println("I am Finnally : for value of b : " + b);
                b--;
            }
        }


    }
}
