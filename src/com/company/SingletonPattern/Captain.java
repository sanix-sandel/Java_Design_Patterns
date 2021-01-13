package com.company.SingletonPattern;

final class Captain {
    //final Class to avoid instantiation if the class were nested

    private static Captain captain;

    private Captain(){};// private in order to avoid the use of new

    public static synchronized Captain getCaptain(){
        if (captain==null){
            captain=new Captain();
            //the singleton instance will not be created until the getCaptain()
            //method is called here
            //It's a lazy initialization
        }else{
            System.out.println("You already have a captain for your team");
            System.out.println("send him for the toss");
        }
        return captain;
    }

}
//Captain class cannot be extended because the constructor is private