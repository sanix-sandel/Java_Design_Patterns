package com.company.BuilderPattern;

interface Builder {

    void startUpOperations();

    void buildBody();

    void insertWheels();

    void addHeadlights();

    void endOperations();

    Product getVehicle();//retrieve the object that is constructed
}
