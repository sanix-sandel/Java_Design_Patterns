package com.company.ProxyPattern;

public class ModifiedProxyPatternExample {

    public static void main(String[] args){
        System.out.println("Modified Proxy Pattern Demo");

        ModifiedProxy px1=new ModifiedProxy("Admin");
        px1.doSomeWork();

        ModifiedProxy px2=new ModifiedProxy("Robin");
        px2.doSomeWork();
    }
}
