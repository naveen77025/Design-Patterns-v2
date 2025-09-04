package org.example.Structural.Facade;

public class Amazon {
    AmazonOrderFacade amazonOrderFacade=new AmazonOrderFacade();
    public void onOrderPlaced(String product, String email){
        amazonOrderFacade.onOrderPlaced(product,email);
    }
}
