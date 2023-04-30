package com.kashtech.designpatterns.abstractfactory;

public abstract class AbstractVehicleManufacturerFactory {
    public abstract ICar getCar();
    public abstract IBike getBike();
}
