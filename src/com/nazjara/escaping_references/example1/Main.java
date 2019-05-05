package com.nazjara.escaping_references.example1;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

        // this will provoke UnsupportedOperationException
        // records.getCustomers().clear();

        for (Customer next : records.getCustomers().values()) {
            System.out.println(next);
        }

        CustomerReadOnly john = records.getCustomerByName("John");
        System.out.println(john.getName());

        // setName() is not defined in CustomerReadOnly
        // john.setName("Derek");

        for (Customer next : records.getCustomers().values()) {
            System.out.println(next);
        }
    }
}
