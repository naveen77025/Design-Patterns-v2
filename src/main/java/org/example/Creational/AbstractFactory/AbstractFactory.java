package org.example.Creational.AbstractFactory;

public interface AbstractFactory {
    public Pizaa createPizza(String type,String size, String shape);
    public Burger createBurger(String type,String size, int slices);
}
