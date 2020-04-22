package Pizza;

public class NYStylePizzaStore extends PizzaStore {

    public Pizza createPizza(Type type) {
        if (type == Type.CHEESE) {
            return new NYStyleCheesePizza();
        } else if (type == Type.PEPPERONI) {
            return new NYStylePepperoniPizza();
        } else if (type == Type.CLAM) {
            return new NYStyleClamPizza();
        }
        return null;
    }
}