public class Record extends Product{
    public Record(String name, double price) {
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
