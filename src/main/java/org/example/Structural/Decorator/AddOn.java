package org.example.Structural.Decorator;

public abstract class AddOn implements IceCream {
    public IceCream iceCream;

    public AddOn(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}
