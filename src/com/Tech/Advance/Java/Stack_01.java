package com.Tech.Advance.Java;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Stack;

public class Stack_01 {
    public static void main(String[] args) {
        System.out.println("hello class : ");

        Stack<String> animals = new Stack<>();

        animals.push("LION");
        animals.push("DOG");
        animals.push("HORSE");
        animals.push("CAT");

        System.out.println(animals);
        animals.remove("DOG");
        System.out.println("Stack : " + animals);
        System.out.println(animals.peek());
        System.out.println(animals.add("ELEPHANT"));
        System.out.println(animals);

    }
}
