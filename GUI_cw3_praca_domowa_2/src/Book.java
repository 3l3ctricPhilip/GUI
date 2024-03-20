public class Book extends Product{

    public Book(String name, double price) {
      super(name,price);
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
