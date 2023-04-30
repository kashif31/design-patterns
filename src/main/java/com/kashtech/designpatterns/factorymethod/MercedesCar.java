package com.kashtech.designpatterns.factorymethod;

public class MercedesCar implements IVehicle{
    @Override
    public String manufacture() {
        return "Mercedes car";
    }
}
