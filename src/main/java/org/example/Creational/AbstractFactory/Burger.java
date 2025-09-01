package org.example.Creational.AbstractFactory;

public abstract class Burger {
    String size;
    int slices;

    public Burger(String size, int slices) {
        this.size = size;
        this.slices = slices;
    }
    public abstract void cook();
}
