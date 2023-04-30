package com.kashtech.designpatterns.abstractfactory;

public class BmwFactory extends AbstractVehicleManufacturerFactory{

    @Override
    public ICar getCar() {
        return new BmwCar();
    }

    @Override
    public IBike getBike() {
        return new BmwBike();
    }
}
