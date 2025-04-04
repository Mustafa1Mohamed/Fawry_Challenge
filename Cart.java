import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products=new ArrayList<>();
    public void add(Product product,int quantity){
        if(product.getQuantatiy()<quantity){
           System.out.println("There are no enough stock");
        }
        else {
            product.reduceQuantity(quantity);
            products.add(product);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
