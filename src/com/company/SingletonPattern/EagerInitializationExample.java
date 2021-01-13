package com.company.SingletonPattern;

public class EagerInitializationExample {

    public static void main(String [] args){
        System.out.println("Singleton pattern with eager initialization");

        Captain1.dummyMethod();
    }
}
//the class is still instantiated already even though we don't need to
//do so