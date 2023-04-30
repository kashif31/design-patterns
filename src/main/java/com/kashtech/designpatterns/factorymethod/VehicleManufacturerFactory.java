package com.kashtech.designpatterns.factorymethod;

public abstract class VehicleManufacturerFactory {
    public abstract IVehicle manufactureVehicle(String vehicleType);

    public IVehicle produceVehicle(String vehicleType){
        IVehicle vehicle = manufactureVehicle(vehicleType);
        vehicle.manufacture();
        return vehicle;
    }
}
