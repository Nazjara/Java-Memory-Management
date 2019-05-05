package com.nazjara.escaping_references.example2;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
        books.add(new Book(1, "Don Quixote", "Miguel De Cervantes", new Price(3.99)));
        books.add(new Book(2, "Pilgrim's Progress", "John Bunyan", new Price(4.45)));
        books.add(new Book(3, "Robinson Crusoe", "Daniel Defoe", new Price(3.99)));
        books.add(new Book(4, "Gulliver's Travels", "Jonathan Swift", new Price(7.60)));
        books.add(new Book(5, "Tom Jones", "Henry Fielding", new Price(9.99)));
        books.add(new Book(6, "Clarissa", "Samuel Richardson", new Price(4.45)));
        books.add(new Book(7, "Dangerous Liaisons", "Pierre Choderlos De Laclos", new Price(11.50)));
        books.add(new Book(8, "Emma", "Jane Austen", new Price(3.99)));
        books.add(new Book(9, "Frankenstein", "Mary Shelley", new Price(7.60)));
        books.add(new Book(10, "The Count of Monte Christo", "Alexandre Dumas", new Price(3.99)));
    }

    public Book findBookByName(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return new Book(book.getId(), book.getTitle(), book.getAuthor(), book.getPrice());
            }
        }
        return null;
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + ": " + book.getPrice().toString());
        }
    }

}
	