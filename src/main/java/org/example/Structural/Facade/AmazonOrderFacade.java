package org.example.Structural.Facade;

public class AmazonOrderFacade {
    InventorySystem inventorySystem=new InventorySystem();
    NotificationSystem notificationSystem=new NotificationSystem();
    public void onOrderPlaced(String product, String email){
        inventorySystem.updateInventory(product);
        notificationSystem.Notify(email);
    }
}
