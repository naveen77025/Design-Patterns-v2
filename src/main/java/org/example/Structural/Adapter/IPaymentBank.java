package org.example.Structural.Adapter;

public interface IPaymentBank {
    public boolean processPayment(String accountNumber,float amount, String receiverAccountNumber );
}
