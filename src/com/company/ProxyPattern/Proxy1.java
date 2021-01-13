package com.company.ProxyPattern;

public class Proxy1 extends Subject1{
    static Subject1 cs;
    static int count=0;

    public Proxy1(){
        cs=new ConcreteSubject1();
        count++;
    }

    @Override
    public void doSomeWork(){
        System.out.println("Proxy call happening now...");
        cs.doSomeWork();
    }
}
