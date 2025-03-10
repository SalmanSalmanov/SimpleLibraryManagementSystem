public class Main {
    public static void main(String[] args) {
        LibraryItem book1 = new Book("Title1", "science");
        LibraryItem book2 = new Book("Title2", "Author2", "adventure");
        LibraryItem book3 = new Book("Title3", "Author3", "fantasy");
        LibraryItem book4 = new Book("Title4", "Author4", "horror");
        LibraryItem book5 = new Book("Title5", "Author5", "technology");
        LibraryItem magazine1 = new Magazine("Title1", "fashion");
        LibraryItem magazine2 = new Magazine("Title2", "sports");
        LibraryItem magazine3 = new Magazine("Title3", "business");
        LibraryItem magazine4 = new Magazine("Title4", "art");
        LibraryItem magazine5 = new Magazine("Title5", "photography");

        Order.addOrders(new LibraryItem[]{book1, book2, book3, book4, book5, magazine1, magazine2, magazine3, magazine4, magazine5});
        Order.addOrder(book5);
        Order.showOrders();
    }
}
