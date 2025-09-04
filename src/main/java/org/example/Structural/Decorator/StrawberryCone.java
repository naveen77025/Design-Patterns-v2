package org.example.Structural.Decorator;

public class StrawberryCone implements IceCream{
    @Override
    public String getDesc() {
        return "Strawberry Cone";
    }

    @Override
    public float getCost() {
        return 15.00f;
    }
}
