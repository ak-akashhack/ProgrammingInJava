package com.Tech.Advance.Java;

interface demoAno{
    int x = 45;
    void meth();
    void meth2();
}
class AnonyDemo implements demoAno{
    public void display(){
        System.out.println("Hello ");
    }

    @Override
    public void meth() {
        System.out.println("I am meth");
    }

    @Override
    public void meth2() {
        System.out.println("I am meth 2 ");
    }
}




public class Anonymus_class_and_Lambda_01 {

    public static void main(String[] args) {
        System.out.println("hello class : ");

//        demoAno obj = new AnonyDemo();
//        obj.meth();
//        obj.meth2();

        demoAno obj = new demoAno() {
            @Override
            public void meth() {
                System.out.println("hello akash :");
            }

            @Override
            public void meth2() {
                System.out.println("hello hacker :");
            }
        };

        obj.meth();
        obj.meth2();


    }
}
