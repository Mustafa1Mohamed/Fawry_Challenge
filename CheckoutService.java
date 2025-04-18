import java.util.ArrayList;
import java.util.List;

public class CheckoutService {
    private static final int SHIPPING_FEE=30;
    public void checkout(Customer customer,Cart cart){
        if (cart.getProducts().isEmpty()){
            System.out.println("Cart is empty");
        }
        else {
            double subtotal=0;
            List<Shippable>shippablesItems=new ArrayList<>();
            for (Product product:cart.getProducts()){
                subtotal+=product.getPrice();
                if (product instanceof Shippable){
                    shippablesItems.add((Shippable)product);
                }
            }
            double totalFee=subtotal+SHIPPING_FEE;
            if (customer.getBalance()<totalFee){
                  System.out.println("Your balance not enough");
            }

            customer.deductBalance(totalFee);
            System.out.println("checkOut Reciept");
            for (Product product:cart.getProducts()){
                System.out.println(product.getName()+' '+product.getPrice());
            }
            System.out.println("===========================");
            System.out.println("Subtotal "+subtotal);
            System.out.println("total "+totalFee);
            System.out.println("ShippingFee "+SHIPPING_FEE);
            System.out.println("Avaliable Balance "+customer.getBalance());

            if (!shippablesItems.isEmpty()) {
                new ShippingService().ship(shippablesItems);
            }
        }
    }
}
