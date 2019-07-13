package com.get.mkcoffee;

public final class Coffee {
    private final CoffeeType type;
    private final int beans;
    private final int milk ;

    public Coffee(CoffeeType coffeeType, int beans, int milk){

        this.type=coffeeType;
        this.beans=beans;
        this.milk=milk;
        //this.milk=1;
    }
    public CoffeeType getType(){
        return type;
    }

    public int getBeans() {
        return beans;
    }

    public int getMilk() {
        return milk;
    }
    @Override
    public String toString(){
        return "Cofee{"+"type=" + type +
                "Beans{"+ beans+
                "milk" + milk;}
    }

