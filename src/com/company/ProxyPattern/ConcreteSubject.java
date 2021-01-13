package com.company.ProxyPattern;

public class ConcreteSubject extends Subject{

    @Override
    public void doSomeWork(){
        System.out.println("doSomework() inside ConcreteSubject is invoked.");
    }
}
