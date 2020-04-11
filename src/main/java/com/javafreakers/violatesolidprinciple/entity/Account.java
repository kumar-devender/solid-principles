package com.javafreakers.violatesolidprinciple.entity;

public interface Account {
    int getAccountNum();

    void localTransfer(int amount);

    void internationalTransfer(int amount);
}
