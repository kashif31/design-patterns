package com.kashtech.designpatterns.strategy;

public class CanFlyLow implements Flyable{
    @Override
    public String fly() {
        return "can fly low";
    }
}
