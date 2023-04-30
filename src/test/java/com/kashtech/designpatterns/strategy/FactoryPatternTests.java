package com.kashtech.designpatterns.strategy;

import com.kashtech.designpatterns.factory.CarFactory;
import com.kashtech.designpatterns.factory.ICar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryPatternTests {

    CarFactory factory;

    @Before
    public void setup(){
        factory = new CarFactory();
    }

    @Test
    public void shouldBeBMW(){
        assertEquals("BMW", factory.getCar("BMW").manufacture());
    }

    @Test
    public void shouldBeMercedes(){
        assertEquals("Mercedes", factory.getCar("Mercedes").manufacture());
    }
}
