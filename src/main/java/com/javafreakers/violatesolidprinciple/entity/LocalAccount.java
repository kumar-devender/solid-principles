package com.javafreakers.violatesolidprinciple.entity;

public class LocalAccount implements Account {
    @Override
    public int getAccountNum() {
        return 0;
    }

    @Override
    public void localTransfer(int amount) {
        System.out.println(String.format("Transfer %s ", amount));
        System.out.println("Small transfer charges deducted");
    }

    /**
     * Violating ISP
     */
    @Override
    public void internationalTransfer(int amount) {
        throw new IllegalStateException("International transfer not supported for local account");
    }
}
