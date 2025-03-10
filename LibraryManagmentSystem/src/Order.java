import java.util.ArrayList;

public class Order {
    private static ArrayList<LibraryItem> orders = new ArrayList<>();

    public static void addOrder(LibraryItem item) {
        orders.add(item);
    }

    public static void addOrders(LibraryItem[] items) {
        for (LibraryItem item : items) {
            addOrder(item);
        }
    }

    public static double getOrdersPrice() {
        double orderPrice = 0;
        for (var item : orders) {
            orderPrice = orderPrice + item.getItemPrice();
        }

        return orderPrice;
    }

    public static void showOrders() {
        for (var item : orders) {
            System.out.println("Type: " + item.getClass().getSimpleName().toUpperCase());
            System.out.println(item.getItemInfo());
            System.out.println("-".repeat(30));
        }
        System.out.println("Total Price = $" + getOrdersPrice());
    }
}
