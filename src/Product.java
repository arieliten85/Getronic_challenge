abstract class Product implements Comparable<Product> {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
    @Override
    public String toString() {
        return String.format("Name: %s /// Price: $%.2f", name, price);
    }
}
