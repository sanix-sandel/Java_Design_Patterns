package com.company.SingletonPattern;

final class DoubleCheckedLocking {

    private static DoubleCheckedLocking captain;

    static int numberOfInstance=0;

    private DoubleCheckedLocking(){
        numberOfInstance++;
        System.out.println("Number jof instances at this momeent= "+numberOfInstance);
    }

    public static DoubleCheckedLocking getCaptain(){
        if (captain==null){
            synchronized (DoubleCheckedLocking.class){
                if (captain==null){
                    captain=new DoubleCheckedLocking();
                    System.out.println("New captain is elected for your team");
                }else{
                    System.out.println("you already have a captain for your team.");
                    System.out.println("send him for the toss");
                }
            }
        }
        return captain;
    }
}
