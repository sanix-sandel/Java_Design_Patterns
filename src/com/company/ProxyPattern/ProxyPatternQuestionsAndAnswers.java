package com.company.ProxyPattern;

public class ProxyPatternQuestionsAndAnswers {

    public static void main(String [] args){
        System.out.println("***Proxy Pattern Demo without lazy instanciation");
        Proxy1 px=new Proxy1();

        px.doSomeWork();

        Proxy1 px1=new Proxy1();
        px1.doSomeWork();

        System.out.println("Instance count= "+Proxy1.count);
    }
}
