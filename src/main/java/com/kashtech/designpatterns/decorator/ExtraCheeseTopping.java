package com.kashtech.designpatterns.decorator;

public class ExtraCheeseTopping extends ToppingsDecorator {
    BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
