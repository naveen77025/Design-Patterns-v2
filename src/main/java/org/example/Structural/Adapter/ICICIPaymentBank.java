package org.example.Structural.Adapter;

import java.util.UUID;
import java.util.random.RandomGenerator;

public class ICICIPaymentBank   {
    public String payment(String accountNumber, float amount, String destinationAccountNumber) {
        return UUID.randomUUID().toString();
    }
}
