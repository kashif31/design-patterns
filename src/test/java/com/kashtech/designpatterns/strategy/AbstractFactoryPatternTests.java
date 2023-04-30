package com.kashtech.designpatterns.strategy;

import com.kashtech.designpatterns.abstractfactory.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractFactoryPatternTests {

    @Test
    public void shouldReturnBmwCar(){
        AbstractVehicleManufacturerFactory bmwFactory = new BmwFactory();
        ICar bmwCar = bmwFactory.getCar();
        assertEquals("Bmw car", bmwCar.manufacture());
    }

    @Test
    public void shouldReturnBmwBike(){
        AbstractVehicleManufacturerFactory bmwFactory = new BmwFactory();
        IBike bmwBike = bmwFactory.getBike();
        assertEquals("Bmw bike", bmwBike.manufacture());
    }

    @Test
    public void shouldReturnMercedesCar(){
        AbstractVehicleManufacturerFactory mercedesFactory = new MercedesFactory();
        ICar mercedesCar = mercedesFactory.getCar();
        assertEquals("Mercedes car", mercedesCar.manufacture());
    }

    @Test
    public void shouldReturnMercedesBike(){
        AbstractVehicleManufacturerFactory mercedesFactory = new MercedesFactory();
        IBike mercedesBike = mercedesFactory.getBike();
        assertEquals("Mercedes bike", mercedesBike.manufacture());
    }
}
