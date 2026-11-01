package librarysystem;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager<T extends LibrarySystem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
        System.out.println("Successfully added item to the library.");
    }

    public void displayAllItems() {
        System.out.println("--- Library Inventory ---");
        for (T item : items) {
            item.displayInfo();
            System.out.println("-------------------------");
        }
    }
}