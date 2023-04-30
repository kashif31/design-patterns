package com.kashtech.designpatterns.abstractfactory;

public class MercedesFactory extends AbstractVehicleManufacturerFactory{

    @Override
    public ICar getCar() {
        return new MercedesCar();
    }

    @Override
    public IBike getBike() {
        return new MercedesBike();
    }
}
