package com.company.SingletonPattern;

public class SingletonPatternExample {

    public static void main(String [] args){
        System.out.println("***Singleton Pattern demo\n");
        System.out.println("trying to make a captain for your team");

        Captain captain1=Captain.getCaptain();
        System.out.println("Trying to make another captain for your team");

        Captain captain2=Captain.getCaptain();
        if(captain1==captain2){
            System.out.println("captain1 and captain2 are the same instance");
        }
    }
}
