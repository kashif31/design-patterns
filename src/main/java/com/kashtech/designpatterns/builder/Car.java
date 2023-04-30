package com.kashtech.designpatterns.builder;

import java.math.BigDecimal;

public class Car {
    private String model;
    private String brand;
    private String color;
    private BigDecimal price;
    private int height;
    private int width;
    private int length;
    private double weight;

    Car(String model, String brand, String color, BigDecimal price, int height, int width, int length, double weight) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }
}
