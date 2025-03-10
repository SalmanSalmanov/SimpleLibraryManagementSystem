public abstract class LibraryItem {
    private String title;
    private String author;
    private int quantity;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public LibraryItem(String title) {
        this(title, "Unknown");
    }

    abstract String getItemInfo();
    abstract double getItemPrice();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
