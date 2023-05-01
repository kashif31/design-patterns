package com.kashtech.designpatterns.strategy;

import com.kashtech.designpatterns.prototype.Sheep;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrototypePatternTests {

    Sheep sally;
    Sheep sallyClone;

    @Before
    public void setup(){
        sally = new Sheep();
        sallyClone = sally.makeCopy();
    }

    @Test
    public void shouldCreateTrueObjectClone(){
        System.out.println("Sally Clone Name: "+sallyClone.getName());
        assertEquals(sally.getName(), sallyClone.getName());
    }

    //As they are on two different locations they are two different objects but their properties are completely cloned
    @Test
    public void newObjectShouldHaveDifferentMemoryLocations(){
        System.out.println("Memory location (Sally):" + System.identityHashCode(sally));
        System.out.println("Memory location (Sally Clone):" + System.identityHashCode(sallyClone));
        Assert.assertNotEquals(System.identityHashCode(sally), System.identityHashCode(sallyClone));
    }
}
