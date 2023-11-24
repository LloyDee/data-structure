package org.example.methods;

import org.example.office.Book;
import org.example.office.Library;

import java.util.Scanner;

public class LibMethods extends BookMethods {
    Scanner scanner = new Scanner(System.in);
    private final Library library;

    public LibMethods(Library library) {
        this.library = library;
    }

    public void addABook() {
        System.out.println("Enter Title");
        String title = scanner.nextLine();
        System.out.println("Enter number of page for " + title);
        int pages = scanner.nextInt();
        System.out.println("Is this active");
        boolean isActive = scanner.nextBoolean();
        scanner.nextLine();
        library.addBook(new Book(title, pages, isActive));
    }

    public void printActiveBooks() {
        int counter = 0;
        for (Book book :
                library.getActiveBooks()) {
            counter++;
            System.out.println(counter + ". " + book.getTitle());
        }
    }

    public void printInActiveBooks() {
        int counter = 0;

        for (Book book :
                library.getInActiveBooks()) {
            counter++;
            System.out.println(counter + ". " + book.getTitle());
        }
    }

    public void printAllBooks() {
        int counter = 0;
        for (Book book :
                library.getBooks()) {
            counter++;
            System.out.println(counter + ". " + book.getTitle());
        }
    }

    public Book printSelectedBook() {
        System.out.println("Select a book from the list by ID number");
        printAllBooks();
        Book book = library.getBooks().get((scanner.nextInt() - 1));
        System.out.println(book);
        return book;
    }


}
