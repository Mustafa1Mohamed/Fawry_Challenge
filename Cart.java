import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products=new ArrayList<>();
    public void add(Product product,int quantaty){
        if(product.getQuantatiy()<quantaty){
           throw new  IllegalArgumentException("not enough stock for "+product.getName());
        }
        product.reduceQuantity(quantaty);
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
