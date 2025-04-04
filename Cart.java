import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products=new ArrayList<>();
    public void add(Product product,int quantaty){
        if(product.getQuantatiy()<quantaty){
           System.out.println("not enough stock for "+product.getName());
        }
        else {
            product.reduceQuantity(quantaty);
            products.add(product);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
