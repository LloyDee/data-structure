package org.example.methods;

import org.example.office.Book;

import java.util.Scanner;

public class BookMethods {
    private Scanner scanner = new Scanner(System.in);

    public void printBookTitle(Book book) {
        System.out.println("Book Title: " + book.getTitle());
    }

    public void printBookCurrentPage(Book book) {
        System.out.println("Book Current Page: " + book.getCurrentPage());
    }

    public void printBookNumberOfPages(Book book) {
        System.out.println("# pages: " + book.getNumberOfPages());

    }

    public void turnBookToPageNumber(Book book) {
        System.out.println("Enter page number turn to:");
        int pageNumber = scanner.nextInt();
        isValidPageNumber(book,pageNumber);
    }
public void setBookActive(Book book){
    System.out.println("Set "+book.getTitle()+" to active");
    book.setActive(true);

}
    public void flipAPage(Book book) {
        System.out.printf("Flipping a page for %s ...\n", book.getTitle());
        book.flipPage();
        System.out.println("You are now in page " + book.getCurrentPage() + " of " + book.getTitle());
    }
    private boolean isValidPageNumber(Book book, int pageNumber){
        if (pageNumber>book.getNumberOfPages()){
            System.out.println("Max page reached! "+book.getNumberOfPages());
            return false;
        }else {
            book.turnToPageNumber(pageNumber);
            System.out.println("You are now in page " + book.getCurrentPage() + " of " + book.getTitle());
            return true;
        }
    }
}
