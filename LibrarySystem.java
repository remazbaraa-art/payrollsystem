package librarysystem;

public class LibrarySystem {
    protected String title;
    protected int itemId;
    protected boolean isAvailable;

    public LibrarySystem(String title, int itemId, boolean isAvailable) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = isAvailable;
    }

    public void displayInfo() {
        System.out.println("Item ID: " + itemId + ", Title: " + title + ", Available: " + isAvailable);
    }
}
