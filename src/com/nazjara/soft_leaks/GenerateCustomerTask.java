package com.nazjara.soft_leaks;

import java.util.UUID;

public class GenerateCustomerTask implements Runnable {

    private CustomerManager cm;

    public GenerateCustomerTask(CustomerManager cm) {
        this.cm = cm;
    }

    @Override
    public void run() {
        while (true) {
            // Simulate user adding a customer through a web page
            String name = new UUID(1L, 10L).toString();
            Customer c = new Customer(name);
            cm.addCustomer(c);
        }
    }
}