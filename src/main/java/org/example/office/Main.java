package org.example.office;

import org.example.methods.LibMethods;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Library library = new Library();
    static LibMethods methods = new LibMethods(library);


    public static void main(String[] args) {


        Book book1 = new Book("Atlas", 100, true);
        Book book2 = new Book("Dictionary", 240, true);
        Book book3 = new Book("Texas 6", 230, false);
        Book book4 = new Book("Mentalist", 399, false);
        Book book5 = new Book("Song Bird", 302, true);
        Book book6 = new Book("Cindy", 543, true);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        boolean switcher = true;

        while (switcher) {

            prompt();
//            switcher = false;
        }
    }

    public static void prompt() {
        System.out.println("Select an option");
        System.out.println("1\tBook" +
                "\n2\tLibrary");
        String option = scanner.nextLine();
        switch (option) {
            case "1" -> ifBookIsSelected();
            case "2" -> ifLibraryIsSelected();
        }
    }

    private static void ifBookIsSelected() {
        System.out.println("Please select a book");
        Book book = methods.printSelectedBook();
        System.out.printf("1\tPrint Title\n" +
                "2\tPrint number of pages\n" +
                "3\tSet active book\n" +
                "4\tFlip a page of book\n" +
                "5\tTurn page book number\n" +
                "6\tPrint current page\n" +
                "\n");
        String option = scanner.nextLine();
        switch (option) {
            case "1" -> methods.printBookTitle(book);
            case "2" -> methods.printBookNumberOfPages(book);
            case "3" -> methods.setBookActive(book);
            case "4" -> methods.flipAPage(book);
            case "5" -> methods.turnBookToPageNumber(book);
            case "6" -> methods.printBookCurrentPage(book);
        }
    }

    private static void ifLibraryIsSelected() {
        System.out.println("Please select an option for Library:");
        System.out.printf("1\tAdd Book\n" +
                "2\tPrint All Active Books\n" +
                "3\tPrint All Inactive Books\n" +
                "4\tPrint All Books\n" +
                "5\tPrint Selected Book\n" +
                "6\tPrint All Active Books\n" +
                "\n");
        String option = scanner.nextLine();
        switch (option) {
            case "1" -> methods.addABook();
            case "2" -> methods.printActiveBooks();
            case "3" -> methods.printInActiveBooks();
            case "4" -> methods.printAllBooks();
            case "5" -> methods.printSelectedBook();
        }
    }
}