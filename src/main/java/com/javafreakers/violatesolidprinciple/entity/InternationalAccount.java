package com.javafreakers.violatesolidprinciple.entity;

public class InternationalAccount implements Account {
    @Override
    public int getAccountNum() {
        return 0;
    }

    @Override
    public void localTransfer(int amount) {
        System.out.println(String.format("Transfer %s ", amount));
    }

    @Override
    public void internationalTransfer(int amount) {
        System.out.println(String.format("Transfer %s ", amount));
    }
}
