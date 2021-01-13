package com.company.PrototypePattern;

public class Nano extends BasicCar{

    public int basePrice;

    public Nano(String m){
        modelName=m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (Nano)super.clone();
    }
}
