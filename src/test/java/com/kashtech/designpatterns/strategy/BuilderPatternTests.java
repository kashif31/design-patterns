package com.kashtech.designpatterns.strategy;

import com.kashtech.designpatterns.builder.Car;
import com.kashtech.designpatterns.builder.CarBuilder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BuilderPatternTests {

    @Test
    public void shouldReturnCarWithAllParameter(){
        CarBuilder builder = new CarBuilder();
        Car car = builder.model("civic")
                        .brand("Honda")
                        .color("white")
                        .price(new BigDecimal(5000000))
                        .height(100)
                        .width(50)
                        .length(200)
                        .weight(800.00)
                        .build();

        assertEquals("civic", car.getModel());
        assertEquals("Honda", car.getBrand());
        assertEquals("white", car.getColor());
        assertEquals(new BigDecimal(5000000), car.getPrice());
        assertEquals(100, car.getHeight());
        assertEquals(50, car.getWidth());
        assertEquals(200, car.getLength());
        assertEquals(800.00, car.getWeight(), 0.00);
    }

    @Test
    public void shouldReturnCarWithLessParameter(){
        CarBuilder builder = new CarBuilder();
        Car car = builder.model("civic")
                .brand("Honda")
                .color("white")
                .price(new BigDecimal(5000000))
                .weight(800.00)
                .build();

        assertEquals("civic", car.getModel());
        assertEquals("Honda", car.getBrand());
        assertEquals("white", car.getColor());
        assertEquals(new BigDecimal(5000000), car.getPrice());
        assertEquals(800.00, car.getWeight(), 0.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException(){
        CarBuilder builder = new CarBuilder();
        Car car = builder.model("")
                .build();

        assertEquals("civic", car.getModel());
    }
}
