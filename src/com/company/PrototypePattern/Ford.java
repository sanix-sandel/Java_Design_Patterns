package com.company.PrototypePattern;

public class Ford extends BasicCar{

    public int basePrice;

    public Ford(String m){
        modelName=m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (Ford)super.clone();
    }
}
