package com.company.ProxyPattern;

public class ProxyPatternExample {

    public static void main(String [] args){
        System.out.println("*** Proxy Pattern Demo ***");
        Proxy px=new Proxy();
        Proxy px1=new Proxy();
        px1.doSomeWork();
        px.doSomeWork();
        System.out.println("Count "+Proxy.count);
    }

    //Real world Example
    //In a classroom, when a student is absent,
    // his best friend may try to mimic his voice
    //during roll call to try to get attendance for his friend.
}
