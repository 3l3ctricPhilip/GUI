public class Clothing extends Product{
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    double getPrice() {
        return price;
    }
}
