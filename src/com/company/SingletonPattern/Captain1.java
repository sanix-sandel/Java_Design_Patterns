package com.company.SingletonPattern;

class Captain1 {

    //Eager initialization

    private static final Captain1 captain=new Captain1();

    private Captain1(){
        System.out.println("A captain is elected for your team");
    };

    public static Captain1 getCaptain1(){
        System.out.println("you have a captain1 for your team");
        return captain;
    }

    public static void dummyMethod(){
        System.out.println("It is a dummy method");
    }
}


//An eager initialization approach has the following
//pros and cons
/*
Pros:
It is straightforward and cleaner

It is the opposite of lazy initialization but still thread safe

It has a small lag time when the application is in execution mode
because everything is already loaded in memory

 */

/*Cons:
The application takes longer to start (compared to lazy initialization)
because everything needs to be loaded first.
 */