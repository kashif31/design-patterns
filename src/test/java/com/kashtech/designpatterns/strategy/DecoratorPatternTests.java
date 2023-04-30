package com.kashtech.designpatterns.strategy;

import com.kashtech.designpatterns.decorator.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorPatternTests {

    @Test
    public void testFarmhousePizzaCost(){
        BasePizza basePizza = new FarmhousePizza();
        assertEquals(50, basePizza.cost());
    }

    @Test
    public void testFarmhousePizzaWithExtraCheeseCost(){
        BasePizza basePizza = new ExtraCheeseTopping(new FarmhousePizza());
        assertEquals(60, basePizza.cost());
    }

    @Test
    public void testFarmhousePizzaWithExtraCheeseAndMushroomCost(){
        BasePizza basePizza = new MushroomTopping(new ExtraCheeseTopping(new FarmhousePizza()));
        assertEquals(75, basePizza.cost());
    }

    @Test
    public void testMargaretaPizzaCost(){
        BasePizza basePizza = new MargaretaPizza();
        assertEquals(70, basePizza.cost());
    }

    @Test
    public void testMargaretaPizzaWithExtraCheeseCost(){
        BasePizza basePizza = new ExtraCheeseTopping(new MargaretaPizza());
        assertEquals(80, basePizza.cost());
    }

    @Test
    public void testVeggieDelightPizzaCost(){
        BasePizza basePizza = new VeggieDelightPizza();
        assertEquals(80, basePizza.cost());
    }

    @Test
    public void testVeggieDelightPizzaWithMushroomCost(){
        BasePizza basePizza = new MushroomTopping(new VeggieDelightPizza());
        assertEquals(95, basePizza.cost());
    }


}
