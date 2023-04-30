package com.kashtech.designpatterns.factorymethod;

public abstract class VehicleManufacturerFactory {
    public abstract IVehicle manufactureVehicle(String vehicleType);

    public IVehicle produceVehicle(String vehicleType){
        IVehicle vehicle = manufactureVehicle(vehicleType); // it will be dynamically (late binding) called based on the child class object,
        return vehicle;
    }
}
