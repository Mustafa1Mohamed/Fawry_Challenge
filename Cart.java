import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products=new ArrayList<>();
    public void add(Product product,int quantity){
        if(product.getQuantatiy()<quantity){
           throw new  IllegalArgumentException("not enough stock for "+product.getName());
        }
        product.reduceQuantity(quantity);
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
