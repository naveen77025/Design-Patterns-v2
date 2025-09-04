package org.example.Structural.Adapter;

public class ICICIBankAdapter implements IPaymentBank{

    @Override
    public boolean processPayment(String accountNumber, float amount, String receiverAccountNumber) {
        ICICIPaymentBank iciciPaymentBank=new ICICIPaymentBank();
        String responseId=iciciPaymentBank.payment(accountNumber,amount,receiverAccountNumber);
        System.out.println("payment processed with reference Id: "+responseId+" of amount "+amount);
        return responseId != null;
    }
}
