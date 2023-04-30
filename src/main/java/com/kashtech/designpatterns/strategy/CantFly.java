package com.kashtech.designpatterns.strategy;

public class CantFly implements Flyable{
    @Override
    public String fly() {
        return "cant fly";
    }
}
