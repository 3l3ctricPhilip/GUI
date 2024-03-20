public class OnlineStore extends ShoppingCart {
    public static void main(String[] args) {

        OnlineStore store = new OnlineStore();

        store.addProduct(new Book("Thinking in Java", 420.0));
        store.addProduct(new Clothing("Chelsea Wolfe T-shirt M", 21.37));
        store.addProduct(new Game("Silent Hill 2", 666));
        store.addProduct(new Record("Jad Ból black LP", 80));

        System.out.println("Całkowita kwota zakupów: "+store.getTotalPrice()+ " PLN");
    }
}