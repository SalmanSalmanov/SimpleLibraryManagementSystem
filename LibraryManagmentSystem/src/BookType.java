public enum BookType {
    SCIENCE(15.50),
    ADVENTURE(12.50),
    FANTASY(18.50),
    HORROR(10.00),
    TECHNOLOGY(20.00);

    private final double price;

    BookType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
