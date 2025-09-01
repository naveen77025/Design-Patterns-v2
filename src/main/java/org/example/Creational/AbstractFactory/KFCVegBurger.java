package org.example.Creational.AbstractFactory;

public class KFCVegBurger extends Burger{
    public KFCVegBurger(String size, int slices) {
        super(size, slices);
    }

    @Override
    public void cook() {
        System.out.println("cooking KFC veg burger of size "+ this.size +" with slices of "+this.slices);
    }
}
