package org.example.Creational.AbstractFactory;

public class KFCVegPizza extends Pizaa {
    public KFCVegPizza(String size, String shape) {
        super(size, shape);
    }

    @Override
    public void cook() {
        System.out.println("cooking KFC veg pizza of size "+ this.size +" with shape "+this.shape);
    }

}
