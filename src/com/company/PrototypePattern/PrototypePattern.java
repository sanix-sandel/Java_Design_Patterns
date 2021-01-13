package com.company.PrototypePattern;

public class PrototypePattern {

    public static void main(String [] args) throws CloneNotSupportedException{
        System.out.println("Prototype pattern Demo");
        BasicCar nano=new Nano("Green nano");

        nano.basePrice=100000;

        BasicCar ford=new Ford("Ford yellow");
        ford.basePrice=500000;

        BasicCar bc1;

        bc1=nano.clone();
        //Price will be more than 100000 for sure
        bc1.onRoadPrice=nano.basePrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: "+bc1.modelName+" and its price is Rs "+bc1.onRoadPrice);


        bc1=ford.clone();
        //Price will be more than 500000 for sure
        bc1.onRoadPrice=ford.basePrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: "+bc1.modelName+" and it's price is Rs."+bc1.onRoadPrice);
    }
}
