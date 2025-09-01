package org.example.Creational.AbstractFactory;

public class MCDVegBurger extends Burger{
    public MCDVegBurger(String size, int slices) {
        super(size, slices);
    }

    @Override
    public void cook() {
        System.out.println("cooking MCD veg burger of size "+ this.size +" with slices of "+this.slices);
    }
}
