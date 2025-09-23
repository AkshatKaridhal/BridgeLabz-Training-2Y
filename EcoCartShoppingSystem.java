import java.util.*;

class product{
    int id;
    String name;
    double price;
}

class OriginalProduct extends product{
    double discountprice = price - (price*10/100);
}

class RecycledProduct extends product{
    double discountprice = price - (price*5/100);
}

public class EcoCartShoppingSystem extends product {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            EcoCartShoppingSystem obj = new EcoCartShoppingSystem();
            obj.price = sc.nextDouble();
            System.out.println(obj.price);
        }
    }
}