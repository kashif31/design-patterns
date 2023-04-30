package com.kashtech.designpatterns.abstractfactory;

public class MercedesCar implements ICar{
    @Override
    public String manufacture() {
        return "Mercedes car";
    }
}
