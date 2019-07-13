// A Cofee shop that can brew coffee and maintain an internal stock of beans and milk
package com.get.mkcoffee;

public final class Cafe {
    private int beansInStock =10;
    private int milkInStock =20;

    public Coffee brew(CoffeeType coffeeType){return brew(coffeeType,1);}

    public Coffee brew(CoffeeType coffeeType, int quantity){
        //requiredPositive(quantity);
        int requiredBeans = coffeeType.getRequiredBeans()*quantity;
        int requiredMilk = coffeeType.getRequiredMilk()*quantity;

        if (requiredBeans>beansInStock || requiredMilk > milkInStock){
            throw new IllegalStateException("Insufficient beans, or milk");
        }

        beansInStock -= requiredBeans;
        milkInStock -= requiredMilk;
        return new Coffee(coffeeType,requiredBeans,requiredMilk);
    }
    public void restockBeans(int weightInGrams){
        //requiredPositive(WeightInGrams);
        beansInStock += weightInGrams;

    }


}
