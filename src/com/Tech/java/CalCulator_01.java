/*
      *  you have to create a custom calculator with following operations :
            1 ==> +    Addition
            2 ==> -    Substraction
            3 ==> *    Multiplication
            4 ==> /    division

      *  Which throws the following exceptioins :
            1 ==> Invalid input exception
            2 ==> cannot divide by 0 exception
            3 ==> max input exception if any of the inputs is greater than 100000
            4 ==> max Multiplier reached exception - dont allown any multiplication input to be greater than 700 :
 */

package com.Tech.java;

import javax.management.MalformedObjectNameException;
import javax.sound.midi.Soundbank;
import javax.swing.plaf.SplitPaneUI;
import java.util.Currency;

class MaxInputExceptionx extends Exception{

    public String toString(){
        return "input can't be greater than 7000";
    }
    public String getMessage(){
        return "input can't be greater than 7000";
    }
}
class MaxInputException extends Exception{

    public String toString(){
        return "input can't be greater than 10000";
    }
    public String getMessage(){
        return "input can't be greater than 10000";
    }
}
class InvalidInputException extends Exception{

    public String toString(){
        return "I am InvalidInputException()";
    }
    public String getMessage(){
        return "I am InvalidInputException()";
    }
}
class CannotDivideByZeroException extends Exception{

    public String toString(){
        return "I am CannotDivideByZeroException()";
    }
    public String getMessage(){
        return "I am CannotDivideByZeroException()";
    }
}
class customCalculator{
    double add(double a,double b) throws InvalidInputException , MaxInputException{

        if (a>10000 || b>10000){
            throw new MaxInputException();
        }

        if(a==8 || b==9)
        throw new InvalidInputException();
        return a + b;
    }
    double sub(double a,double b) throws MaxInputException{
        if (a>10000 || b>10000){
            throw new MaxInputException();
        }
        return a - b;
    }
    double mult(double a,double b)throws MaxInputException{
        if (a>10000 || b>10000){
            throw new MaxInputException();
        }
        return a * b;
    }
    double div(double a,double b) throws CannotDivideByZeroException, MaxInputException,MaxInputExceptionx{
        if (a>10000 || b>10000){
            throw new MaxInputException();
        }
        else if (a>7000 || b>7000){
            throw new MaxInputExceptionx();
        }

        if(b == 0 )
            throw new CannotDivideByZeroException();
        return a / b;
    }
}

public class CalCulator_01 {
    public static void main(String[] args) throws CannotDivideByZeroException , InvalidInputException , MaxInputException, MaxInputExceptionx{
//        System.out.println("hello akash : ");

        customCalculator ak = new customCalculator();

        System.out.println(ak.div(7344,7341));

        System.out.println(ak.add(8,9));
        System.out.println(ak.div(8,0));




    }
}





//___________________________________________________________________________

//class customCalculator{
//    double add(double a,double b)  {
//        return a + b;
//    }
//    double sub(double a,double b){
//        return a - b;
//    }
//    double mult(double a,double b){
//        return a * b;
//    }
//    double div(double a,double b)  {
//
//        return a / b;
//
//    }
//}public class CalCulator_01 {
//    public static void main(String[] args){
////        System.out.println("hello akash : ");
//
//        customCalculator ak = new customCalculator();
//
//        System.out.println(ak.div(10,0));;
//
//
//
//    }
//}

//