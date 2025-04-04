public class NonEpirableProducts extends Product{

    public NonEpirableProducts(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public boolean isShippable() {
        return false;
    }
}
