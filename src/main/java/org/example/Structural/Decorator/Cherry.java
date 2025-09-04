package org.example.Structural.Decorator;

public class Cherry extends AddOn{
    public Cherry(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc()+", cherry on top";
    }

    @Override
    public float getCost() {
        return iceCream.getCost()+5.00f;
    }
}
