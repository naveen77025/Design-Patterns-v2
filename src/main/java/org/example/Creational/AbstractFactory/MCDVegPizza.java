package org.example.Creational.AbstractFactory;

public class MCDVegPizza extends Pizaa {
    public MCDVegPizza(String size, String shape) {
        super(size, shape);
    }

    @Override
    public void cook() {
        System.out.println("cooking MCD veg pizza of size "+ this.size +" with shape "+this.shape);
    }

}
