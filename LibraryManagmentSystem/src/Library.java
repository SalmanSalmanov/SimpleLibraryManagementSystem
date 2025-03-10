import java.util.ArrayList;

public class Library<T extends LibraryItem> {
    private ArrayList<T> items = new ArrayList<>();
    private ArrayList<T> purchasedItems = new ArrayList<>();

    public void purchaseItem(String title) {
        for (var item : items) {
            int itemQuantity = item.getQuantity();
            if (item.getTitle().equalsIgnoreCase(title)) {
                itemQuantity--;
                item.setQuantity(itemQuantity);
                purchasedItems.add(item);
                items.remove(item);
            }
        }
    }
}
