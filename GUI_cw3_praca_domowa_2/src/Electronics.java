public class Electronics extends Product{
    public Electronics(String name, double price) {
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
