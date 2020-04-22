import Pizza.ChicagoStylePizzaStore;
import Pizza.NYStylePizzaStore;
import Pizza.PizzaStore;
import Pizza.Type;
import Pizza.Pizza;

public class driver {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza1 = nyStore.orderPizza(Type.CHEESE);
        System.out.println("\nPizza #1: ");
        System.out.println(pizza1.toString());

        Pizza pizza2 = chicagoStore.orderPizza(Type.PEPPERONI);
        System.out.println("\nPizza #2: ");
        System.out.println(pizza2.toString());

        Pizza pizza3 = nyStore.orderPizza(Type.CLAM);
        System.out.println("\nPizza #3: ");
        System.out.println(pizza3.toString());
    }
}