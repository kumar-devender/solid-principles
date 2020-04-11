package com.javafreakers.violatesolidprinciple.main;

import com.javafreakers.violatesolidprinciple.payment.PaymentProcessor;

public class ViolatingDIP {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.sendPayment();
    }
}
