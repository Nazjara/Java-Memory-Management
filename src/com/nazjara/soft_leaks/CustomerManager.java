package com.nazjara.soft_leaks;

import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomerManager {

    private List<Customer> customers = new CopyOnWriteArrayList<>();
    private AtomicInteger nextId = new AtomicInteger();

    public void addCustomer(Customer customer) {
        customer.setId(nextId.getAndIncrement());
        customers.add(customer);
    }

    public void howManyCustomers() {
        System.out.println("" + new Date() + " : " + customers.size());
    }
}
