
public abstract class Product {
    private final String name;
    private final double price;
    private  int quantatiy;

    public Product(String name,double price,int quantatiy) {
        this.name = name;
        this.price=price;
        this.quantatiy=quantatiy;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantatiy() {
        return quantatiy;
    }

    public void reduceQuantity(int amount){
        quantatiy-=amount;
    }
    public abstract boolean isShippable();
}
