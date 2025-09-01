package org.example.Creational.AbstractFactory;

public class MCDNonVegBurger extends Burger{
    public MCDNonVegBurger(String size, int slices) {
        super(size, slices);
    }

    @Override
    public void cook() {
        System.out.println("cooking MCD Non-veg burger of size "+ this.size +" with slices of "+this.slices);
    }
}
