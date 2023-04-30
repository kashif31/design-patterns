package com.kashtech.designpatterns.factory;

public class CarFactory {
    ICar car;

    public ICar getCar(String carType){
        switch (carType){
            case "BMW":
                car = new BMW();
                break;
            case "Mercedes":
                car = new Mercedes();
                break;
        }
        return car;
    }
}
