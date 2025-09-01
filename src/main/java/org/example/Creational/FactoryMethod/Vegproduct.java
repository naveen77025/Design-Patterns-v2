package org.example.Creational.FactoryMethod;

public class Vegproduct implements Product{
    String name;

    public Vegproduct(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vegproduct{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void cook() {
        System.out.println(name+" is ready");
    }
}
