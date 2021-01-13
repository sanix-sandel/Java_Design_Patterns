package com.company.FactoryMethodPattern;

public class TigerFactory extends AnimalFactory{

    public Animal createAnimal(){
        return new Tiger();
    }
}
