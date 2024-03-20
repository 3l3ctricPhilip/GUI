public abstract class Product {

    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract String getName();

    abstract double getPrice();



}
