package com.kashtech.designpatterns.strategy;

public class Animal {
    private String name;
    public Flyable flyingStrategy;

    public Animal(){}

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String canFly(){
        return this.flyingStrategy.fly();
    }

    public void setFlyingAbility(Flyable newFlyingStrategy){
        this.flyingStrategy = newFlyingStrategy;
    }
}
