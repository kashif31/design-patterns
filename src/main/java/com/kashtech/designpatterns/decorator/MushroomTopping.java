package com.kashtech.designpatterns.decorator;

public class MushroomTopping extends ToppingsDecorator {

    BasePizza basePizza;

    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
