package org.example.Creational.AbstractFactory;

public class KFCNonVegPizza extends Pizaa{
    public KFCNonVegPizza(String size, String shape) {
        super(size, shape);
    }

    @Override
    public void cook() {
        System.out.println("cooking KFC Non-veg pizza of size "+ this.size +" with shape "+this.shape);
    }
}
