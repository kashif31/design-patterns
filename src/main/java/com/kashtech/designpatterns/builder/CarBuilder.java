package com.kashtech.designpatterns.builder;

import java.math.BigDecimal;

public class CarBuilder {
    private String model;
    private String brand;
    private String color;
    private BigDecimal price;
    private int height;
    private int width;
    private int length;
    private double weight;

    public CarBuilder model(String model) {
        if(!model.isBlank()){
            this.model = model;
        }else{
            throw new IllegalArgumentException();
        }
        return this;
    }

    public CarBuilder brand(String brand) {
        if(!brand.isBlank()){
            this.brand = brand;
        }else{
            throw new IllegalArgumentException();
        }
        return this;
    }

    public CarBuilder color(String color) {
        if(!color.isBlank()){
            this.color = color;
        }else{
            throw new IllegalArgumentException();
        }
        return this;
    }

    public CarBuilder price(BigDecimal price) {
        if(price.compareTo(new BigDecimal(0)) > 0){
            this.price = price;
        }else{
            throw new IllegalArgumentException();
        }
        return this;
    }

    public CarBuilder height(int height) {
        if(height > 0){
            this.height = height;
        }else{
            throw new IllegalArgumentException();
        }
        return this;
    }

    public CarBuilder width(int width) {
        if(width > 0){
            this.width = width;
        }else{
            throw new IllegalArgumentException();
        }
        return this;
    }

    public CarBuilder length(int length) {
        if(length > 0){
            this.length = length;
        }else{
            throw new IllegalArgumentException();
        }
        return this;
    }

    public CarBuilder weight(double weight) {
        if(weight > 0){
            this.weight = weight;
        }else{
            throw new IllegalArgumentException();
        }
        return this;
    }

    public Car build(){
        return new Car(model, brand, color, price, height, width, length, weight);
    }
}
