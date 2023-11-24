package org.example.office;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getActiveBooks() {
        List<Book> activeBooks = new ArrayList<>();
        for (Book thisBook :
                books) {
            if (thisBook.isActive()) {
                activeBooks.add(thisBook);
            }
        }
        return activeBooks;
    }

    public List<Book> getInActiveBooks() {
        List<Book> inActiveBooks = new ArrayList<>();
        for (Book thisBook :
                books) {
            if (!thisBook.isActive()) {
                inActiveBooks.add(thisBook);
            }
        }
        return inActiveBooks;
    }


    public List<Book> getBooks() {
        return books;
    }

    public Book selectBook(Book book) {
        Book bookSelected = null;
        for (Book thisBook :
                books) {
            if (thisBook.getTitle().equalsIgnoreCase(book.getTitle())) {
                bookSelected = thisBook;
                break;
            }
        }
        return bookSelected;
    }
}
