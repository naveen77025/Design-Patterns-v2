package org.example.Creational.AbstractFactory;

public class KFCNonVegBurger extends Burger{
    public KFCNonVegBurger(String size, int slices) {
        super(size, slices);
    }

    @Override
    public void cook() {
        System.out.println("cooking KFC Non-veg burger of size "+ this.size +" with slices of "+this.slices);
    }
}
