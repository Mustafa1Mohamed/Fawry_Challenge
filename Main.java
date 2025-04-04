import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Product cheese = new ExpirableProducts("Cheese", 200, 5, 200);
        Product biscuits = new ExpirableProducts("Biscuits", 150, 10, 700);
        Product tv = new NonEpirableProducts("TV", 3000, 2);
        Product scratchCard = new NonEpirableProducts("Scratch Card", 50, 100);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);

        Customer customer = new Customer(2000);
        System.out.println("Hello World");
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(customer, cart);
    }
}