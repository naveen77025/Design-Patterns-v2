package org.example.Creational.AbstractFactory;

public class KFCFactory implements AbstractFactory{
    @Override
    public Pizaa createPizza(String type, String size, String shape) {
        if("veg".equalsIgnoreCase(type)){
            return new KFCVegPizza(size,shape);
        }
        else{
            return new KFCNonVegPizza(size,shape);
        }
    }

    @Override
    public Burger createBurger(String type, String size, int slices) {
        if("veg".equalsIgnoreCase(type)){
            return new KFCVegBurger(size,slices);
        }
        else{
            return new KFCNonVegBurger(size,slices);
        }
    }
}
