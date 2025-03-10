public class Magazine extends LibraryItem {
    private double price;
    private MagazineType magazineType;

    public Magazine(String title, String type) {
        super(title);
        this.magazineType = MagazineType.valueOf(type.toUpperCase());
        this.price = magazineType.getPrice();
    }

    @Override
    String getItemInfo() {
        return "Genre: " + magazineType + "\nTitle:: " + getTitle() + "\nPrice: $" + price;
    }

    @Override
    double getItemPrice() {
        return this.price;
    }
}
