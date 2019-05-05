package com.nazjara.escaping_references.example2;

public class Main {

    public static void main(String[] args) {

        BookCollection bc = new BookCollection();

        bc.printAllBooks();

        System.out.println("-------------------------------------");

        //get price of book called Tom Jones in EUR
        System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));

        System.out.println("-------------------------------------");

        bc.printAllBooks();
    }
}
