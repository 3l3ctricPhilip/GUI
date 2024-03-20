public class Game extends Product {
    public Game(String name, double price) {
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