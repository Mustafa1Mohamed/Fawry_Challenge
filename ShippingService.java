import java.util.List;

public class ShippingService {
    public void ship(List<Shippable> items){
        System.out.println("Shipping notice");
        double total=0;
        for(Shippable item:items){
            System.out.println(item.getName()+" "+item.getWeghit()+'g');
            total+=item.getWeghit();
        }
        System.out.println("total package wieght "+total/1000 +"kg");
    }
}
