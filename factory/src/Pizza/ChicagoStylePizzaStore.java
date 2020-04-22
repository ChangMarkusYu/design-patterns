package Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    public Pizza createPizza(Type type) {
        if (type == Type.CHEESE) {
            return new ChicagoStyleCheesePizza();
        } else if (type == Type.PEPPERONI) {
            return new ChicagoStylePepperoniPizza();
        } else if (type == Type.CLAM) {
            return new ChicagoStyleClamPizza();
        }
        return null;
    }

}