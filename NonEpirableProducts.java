public class NonEpirableProducts extends Product{

    public NonEpirableProducts(String name, double price, int quantatiy) {
        super(name, price, quantatiy);
    }

    @Override
    public boolean isShippable() {
        return false;
    }
}
