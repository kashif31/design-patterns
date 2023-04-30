package com.kashtech.designpatterns.factorymethod;

public class BmwBike implements IVehicle{
    @Override
    public String manufacture() {
        return "Bmw bike";
    }
}
