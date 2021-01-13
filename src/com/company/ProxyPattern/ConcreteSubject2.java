package com.company.ProxyPattern;

public class ConcreteSubject2 extends Subject{

    @Override
    public void doSomeWork(){
        System.out.println("doSomework() inside ConcreteSubject is invoked");
    }
}
