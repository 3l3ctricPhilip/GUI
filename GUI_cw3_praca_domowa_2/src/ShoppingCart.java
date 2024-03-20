import java.util.ArrayList;
import java.util.List;

public abstract class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    void removeProduct(Product product) {
        products.remove(product);
    }

    double getTotalPrice() {
        return products
                .stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
