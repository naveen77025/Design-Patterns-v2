package org.example.Creational.AbstractFactory;

public abstract class Pizaa {
    String size;
    String shape;

    public Pizaa(String size, String shape) {
        this.size = size;
        this.shape = shape;
    }
    public abstract void cook();
}
