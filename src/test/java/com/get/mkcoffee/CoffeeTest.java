package com.get.mkcoffee;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeTest {

    @Before
    public void setUp() throws Exception {
        Cafe cafe = null;
    }

    @Test
    public void CanBrewExpress(){
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
        Assert.assertEquals(0,coffee.getMilk());
        Assert.assertEquals(7,coffee.getBeans());
    }

    @After
    public void tearDown() throws Exception {
    }


}