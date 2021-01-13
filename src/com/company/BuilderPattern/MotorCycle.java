package com.company.BuilderPattern;

class MotorCycle implements Builder {
    private String brandName;
    private Product product;

    public MotorCycle(String brandName) {
        product = new Product();
        this.brandName = brandName;
    }

    public void startUpOperations() {

    }

    public void buildBody() {
        product.add("This is a body of a Motorcycle");
    }

    public void insertWheels() {
        product.add("2 wheels are added");
    }

    public void addHeadlights() {
        product.add("1 Headlights are added");
    }

    public void endOperations() {
        //Finishing up with brand name
        product.add(String.format("Motorcycle model is :%s", this.brandName));
    }

    public Product getVehicle() {
        return product;
    }
}
