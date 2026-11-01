package librarysystem;

public class Magazine extends LibrarySystem {
    private int issueNumber;
    private String publisher;

    public Magazine(String title, int itemId, boolean isAvailable, int issueNumber, String publisher) {
        super(title, itemId, isAvailable);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber + ", Publisher: " + publisher);
    }
}