package com.kashtech.designpatterns.factorymethod;

public class MercedesTruck implements IVehicle{
    @Override
    public String manufacture() {
        return "Mercedes truck";
    }
}
