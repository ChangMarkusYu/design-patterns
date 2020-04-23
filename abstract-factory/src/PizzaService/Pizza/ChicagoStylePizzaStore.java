package PizzaService.Pizza;

import PizzaService.IngredientFactory.*;

public class ChicagoStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(Type type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type == Type.CHEESE) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type == Type.CLAM) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }

        return pizza;
    }
}