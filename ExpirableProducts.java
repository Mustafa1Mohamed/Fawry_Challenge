public class ExpirableProducts extends Product implements Shippable{
    private final double weight;
    public ExpirableProducts(String name, double price, int quantatiy,double weight) {
        super(name, price, quantatiy);
        this.weight=weight;
    }

    @Override
    public boolean isShippable() {
        return true;

    }


    @Override
    public double getWeghit() {
        return weight;
    }
}
