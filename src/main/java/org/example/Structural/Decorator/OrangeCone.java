package org.example.Structural.Decorator;

public class OrangeCone implements IceCream{
    @Override
    public String getDesc() {
        return "Orange cone";
    }

    @Override
    public float getCost() {
        return 10.00f;
    }
}
