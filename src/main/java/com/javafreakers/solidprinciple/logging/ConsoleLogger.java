package com.javafreakers.solidprinciple.logging;

public class ConsoleLogger {
    public void logInfo(String msg) {
        System.out.println("Message : " + msg);
    }

    public void logError(String msg, Exception e) {
        System.err.println("Error : " + msg + " ; " + e);
    }
}
