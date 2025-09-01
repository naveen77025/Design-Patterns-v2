package org.example.Creational.FactoryMethod;

public class NonVegRes implements FactoryMethod{
    @Override
    public Product createProduct(String name) {
        return new NonVegProduct(name);
    }
}
