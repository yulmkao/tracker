package ru.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 256);
        Book book2 = new Book("The Princess on the Pea", 346);
        Book book3 = new Book("Snow White", 1001);
        Book book4 = new Book("Thumbelina", 525);
        Book[] shelf = new Book[4];
        shelf[0] = book1;
        shelf[1] = book2;
        shelf[2] = book3;
        shelf[3] = book4;
        for (int i = 0; i < shelf.length; i++) {
            Book book = shelf[i];
            System.out.println("book's name: " + book.getName() + ", number of pages: " + book.getPagesCount());
        }

        System.out.println("When book1 and book3 are switched:");
        Book tempBook = shelf[0];
        shelf[0] = book3;
        shelf[2] = tempBook;
        for (int i = 0; i < shelf.length; i++) {
            Book book = shelf[i];
            System.out.println("book's name: " + book.getName() + ", number of pages: " + book.getPagesCount());
        }

        System.out.println("Only books named 'Clean code':");
        for (int i = 0; i < shelf.length; i++) {
            Book book = shelf[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println("book's name: " + book.getName() + ", number of pages: " + book.getPagesCount());
            }
        }
    }
}
