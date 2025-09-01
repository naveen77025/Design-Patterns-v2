package org.example.Creational.FactoryMethod;

public class VegRes implements FactoryMethod{
    @Override
    public Product createProduct(String name) {
        return new Vegproduct(name);
    }
}
