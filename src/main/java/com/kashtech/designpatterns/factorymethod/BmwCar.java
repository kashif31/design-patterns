package com.kashtech.designpatterns.factorymethod;

public class BmwCar implements IVehicle{
    @Override
    public String manufacture() {
        return "Bmw car";
    }
}
