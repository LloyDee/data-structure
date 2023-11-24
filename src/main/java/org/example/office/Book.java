package org.example.office;

public class Book {
    private String title;
    private int numberOfPages;

    private boolean isActive;
    private int currentPage;

    public Book(String title, int numberOfPages, boolean isActive) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.isActive = isActive;
        this.currentPage = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isActive() {
        return isActive;
    }

    public void flipPage() {
        currentPage++;
    }

    public void turnToPageNumber(int pageNumber) {
        currentPage = pageNumber;
    }

    public int getCurrentPage() {
        return currentPage;
    }


    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", isActive=" + isActive +
                ", currentPage=" + currentPage +
                '}';
    }
}
