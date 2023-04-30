package com.kashtech.designpatterns.factorymethod;

public class BmwFactory extends VehicleManufacturerFactory {
    @Override
    public IVehicle manufactureVehicle(String vehicleType) {
        IVehicle vehicle;
        switch(vehicleType){
            case "Car":
                vehicle = new BmwCar();
                break;
            case "Bike":
                vehicle = new BmwBike();
                break;
            default:
                return null;
        }
        return vehicle;
    }
}
