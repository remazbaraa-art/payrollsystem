package librarysystem;

public class Main {
    public static void main(String[] args) {
        LibraryManager<LibrarySystem> manager = new LibraryManager<>();

        Book myBook = new Book("Java Programming", 101, true, "John Smith", 350);
        Magazine myMagazine = new Magazine("Tech World", 202, true, 45, "Global Media");

        manager.addItem(myBook);
        manager.addItem(myMagazine);

        System.out.println();
        manager.displayAllItems();
    }
}