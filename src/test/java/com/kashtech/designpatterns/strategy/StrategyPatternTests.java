package com.kashtech.designpatterns.strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrategyPatternTests {

    @Test
    public void dogShouldNotFly(){
        Animal dog = new Dog("sparky");
        dog.setFlyingAbility(new CantFly());
        assertEquals("cant fly", dog.canFly());
    }

    @Test
    public void dogShouldFly(){
        Animal dog = new Dog("sparky");
        dog.setFlyingAbility(new CanFlyHigh());
        assertEquals("can fly high", dog.canFly());
    }

    @Test
    public void duckShouldFlyLow(){
        Animal duck = new Duck("tweety");
        duck.setFlyingAbility(new CanFlyLow());
        assertEquals("can fly low", duck.canFly());
    }

    @Test
    public void eagleShouldFlyHigh(){
        Animal eagle = new Eagle("hawk");
        eagle.setFlyingAbility(new CanFlyHigh());
        assertEquals("can fly high", eagle.canFly());
    }
}
