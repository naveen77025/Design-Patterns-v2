package org.example.Creational.FactoryMethod;

public class NonVegProduct implements Product{
    String name;

    public NonVegProduct(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NonVegProduct{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void cook() {
        System.out.println(name+" is getting cooked");
    }
}
