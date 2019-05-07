package com.nazjara.soft_leaks;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CustomerHarness {

    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager();
        GenerateCustomerTask task = new GenerateCustomerTask(cm);
        Executor executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executor.execute(task);
        }

        // main thread is now acting as the monitoring thread
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cm.howManyCustomers();
            System.out.println("Available memory: " + Runtime.getRuntime().freeMemory() / 1024 / 1024 + " MB");

        }
    }
}