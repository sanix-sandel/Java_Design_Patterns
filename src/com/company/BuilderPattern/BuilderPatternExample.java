package com.company.BuilderPattern;

import java.util.LinkedList;

public class BuilderPatternExample{
    public static void main(String [] args){
        System.out.println("Builder pattern");
        Director director=new Director();

        Builder foodCar=new Car("Ford");
        Builder hondaMotorcycle=new MotorCycle("Honda");

        //Making Car
        director.construct(foodCar);
        Product p1=foodCar.getVehicle();
        p1.showProduct();

        //Making MotorCycle
        director.construct(hondaMotorcycle);
        Product p2=hondaMotorcycle.getVehicle();
        p2.showProduct();
    }
}
