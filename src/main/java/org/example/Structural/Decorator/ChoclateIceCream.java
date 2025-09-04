package org.example.Structural.Decorator;

public class ChoclateIceCream extends AddOn{

    public ChoclateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc()+", choclate Icecream";
    }

    @Override
    public float getCost() {
        return iceCream.getCost()+20.00f;
    }
}
