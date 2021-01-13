package com.company.ProxyPattern;

public class ConcreteSubject1 extends Subject1{

    @Override
    public void doSomeWork(){
        System.out.println("doSomeWork () inside ConcreteSubject is invoked");
    }
}
