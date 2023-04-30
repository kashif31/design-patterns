package com.kashtech.designpatterns.strategy;

import com.kashtech.designpatterns.factorymethod.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryMethodPatternTests {

    @Test
    public void shouldManufactureBmwCar(){
       BmwFactory bmwFactory = new BmwFactory();
       IVehicle bmwCar = bmwFactory.produceVehicle("Car");
       assertEquals("Bmw car", bmwCar.manufacture());
    }

    @Test
    public void shouldManufactureBmwBike(){
        BmwFactory bmwFactory = new BmwFactory();
        IVehicle bmwBike = bmwFactory.produceVehicle("Bike");
        assertEquals("Bmw bike", bmwBike.manufacture());
    }

    @Test
    public void shouldManufactureMercedesCar(){
        MercedesFactory mercedesFactory = new MercedesFactory();
        IVehicle mercedesCar = mercedesFactory.produceVehicle("Car");
        assertEquals("Mercedes car", mercedesCar.manufacture());
    }

    @Test
    public void shouldManufactureMercedesTruck(){
        MercedesFactory mercedesFactory = new MercedesFactory();
        IVehicle mercedesTruck = mercedesFactory.produceVehicle("Truck");
        assertEquals("Mercedes truck", mercedesTruck.manufacture());
    }
}
