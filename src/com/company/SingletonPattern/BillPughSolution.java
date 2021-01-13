package com.company.SingletonPattern;

class BillPughSolution {

    private BillPughSolution(){
        System.out.println("A captain is elected for your team");
    }

    private static class SingletonHelper{
        private static final BillPughSolution captain=new BillPughSolution();
    }

    public static BillPughSolution getCaptain(){
        return SingletonHelper.captain;
    }


}
//There's no use of of a synchronization technique amd eager initialization
//The SingletonHelper class comes into consideration only when someone
//invokes the getCaptain() method
//This approach will not create any unwanted output if you just call
//any dummyMethod() from main()