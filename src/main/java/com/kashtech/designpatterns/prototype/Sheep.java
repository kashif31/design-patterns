package com.kashtech.designpatterns.prototype;

public class Sheep implements Animal {

    String name = "Sally";

    public Sheep() {
        System.out.println("Sheep is made");
    }

    public String getName() {
        return name;
    }

    @Override
    public Sheep makeCopy() {
        System.out.println("cloning is in process");
        Sheep clonedSheep;
        try {
            clonedSheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clonedSheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                '}';
    }
}
