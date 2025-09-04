package org.example.Structural.Decorator;

public class BlackCurrentIceCream extends AddOn{

    public BlackCurrentIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc()+", blackcurrent Icecream";
    }

    @Override
    public float getCost() {
        return iceCream.getCost()+25.00f;
    }
}
