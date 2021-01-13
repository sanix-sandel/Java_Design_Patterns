package com.company.ProxyPattern;

public class Proxy extends Subject{

    static Subject cs;
    static int count=0;

    @Override
    public void doSomeWork(){
        System.out.println("Proxy call happening now....");
        //Lazy initialization: We'll not instanciate until the method
        //is called
        if(cs==null){
            cs=new ConcreteSubject();
            count++;
        }
        cs.doSomeWork();
        //The client is talking to a concreteSubject instance
        //through a proxy method
    }
}
