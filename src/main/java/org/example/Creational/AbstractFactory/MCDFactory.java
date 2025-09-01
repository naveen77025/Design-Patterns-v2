package org.example.Creational.AbstractFactory;

public class MCDFactory implements AbstractFactory{
    @Override
    public Pizaa createPizza(String type, String size, String shape) {
        if("veg".equalsIgnoreCase(type)){
            return new MCDVegPizza(size,shape);
        }
        else{
            return new MCDNonVegPizza(size,shape);
        }
    }

    @Override
    public Burger createBurger(String type, String size, int slices) {
        if("veg".equalsIgnoreCase(type)){
            return new MCDVegBurger(size,slices);
        }
        else{
            return new MCDNonVegBurger(size,slices);
        }
    }
}
