public enum MagazineType {
    FASHION(15.50),
    SPORTS(12.50),
    BUSINESS(18.50),
    ART(10.00),
    PHOTOGRAPHY(20.00);

    private final double price;

    MagazineType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
