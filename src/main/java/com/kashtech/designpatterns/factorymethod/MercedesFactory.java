package com.kashtech.designpatterns.factorymethod;

public class MercedesFactory extends VehicleManufacturerFactory {
    @Override
    public IVehicle manufactureVehicle(String vehicleType) {
        IVehicle vehicle;
        switch(vehicleType){
            case "Car":
                vehicle = new MercedesCar();
                break;
            case "Truck":
                vehicle = new MercedesTruck();
                break;
            default:
                return null;
        }
        return vehicle;
    }
}
