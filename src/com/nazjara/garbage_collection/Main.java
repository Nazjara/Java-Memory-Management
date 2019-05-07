package com.nazjara.garbage_collection;

public class Main {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long availableBytes = runtime.freeMemory();
        System.out.println("Available memory before creating garbage: " + availableBytes / 1024 / 1024 + " MB");

        // let's create a ton of garbage....
        Customer c;
        for (int i = 0; i < 1000000; i++) {
            c = new Customer("John");
        }

        availableBytes = runtime.freeMemory();
        System.out.println("Available memory after creating garbage: " + availableBytes / 1024 / 1024 + " MB");

        System.gc();

        // https://stackoverflow.com/questions/55194152/why-is-openjdk-11-java-garbage-collector-decreasing-free-memory-in-this-sample
        availableBytes = runtime.freeMemory();
        System.out.println("Available memory after running System.gc() method: " + availableBytes / 1024 / 1024 + " MB");
    }
}
