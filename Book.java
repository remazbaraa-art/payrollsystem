package librarysystem;

public class Book extends LibrarySystem {
    private String author;
    private int numberOfPages;

    public Book(String title, int itemId, boolean isAvailable, String author, int numberOfPages) {
        super(title, itemId, isAvailable);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author + ", Pages: " + numberOfPages);
    }
}