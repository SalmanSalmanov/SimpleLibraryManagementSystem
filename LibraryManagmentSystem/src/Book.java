public class Book extends LibraryItem implements Borrowable {
    private double price;
    private BookType bookType;
    private boolean isBorrowed = false;

    public Book(String title, String author, String type) {
        super(title, author);
        this.bookType = BookType.valueOf(type.toUpperCase());
        this.price = bookType.getPrice();
    }

    public Book(String title, String type) {
        super(title);
        this.bookType = BookType.valueOf(type.toUpperCase());
        this.price = bookType.getPrice();
    }

    @Override
    String getItemInfo() {
        return "Genre: " + bookType + "\nBook: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPrice: $" + price;
    }

    @Override
    double getItemPrice() {
        return this.price;
    }

    @Override
    public void returnItem() {

    }
}
