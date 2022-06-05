package com.Tech.Advance.Java;

class ak extends akkk{
    @Override                //   <======================

    public void show(){
        System.out.println("tethod : ");
    }
    public int sum(int a,int b){
        return a+b;
    }
}

public class Annotations_01 {
    public static void main(String[] args) {
        System.out.println("hello class : ");

        ak as = new ak();

        as.show();
        as.sum(12,34);
    }
}
