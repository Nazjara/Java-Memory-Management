package com.nazjara.memory_exercise;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    void start() {
        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.print(container.getInitial()); // B
    }

    void another(Container initialHolder, String newInitial) {
        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        initialHolder = new Container();
        System.out.print(initialHolder.getInitial()); // A
        System.out.print(newInitial); // Z
    }
}
