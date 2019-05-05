package com.nazjara.escaping_references.example1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CustomerRecords {
    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

    // return unmodifiable copy of original collection
    public Map<String, Customer> getCustomers() {
        return Collections.unmodifiableMap(records);
    }

    // return interface without change ability
    public CustomerReadOnly getCustomerByName(String name) {
        return records.get(name);
    }
}
