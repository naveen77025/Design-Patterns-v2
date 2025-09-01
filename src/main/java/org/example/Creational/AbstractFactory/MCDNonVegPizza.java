package org.example.Creational.AbstractFactory;

public class MCDNonVegPizza extends Pizaa{
    public MCDNonVegPizza(String size, String shape) {
        super(size, shape);
    }

    @Override
    public void cook() {
        System.out.println("cooking MCD Non-veg pizza of size "+ this.size +" with shape "+this.shape);
    }
}
