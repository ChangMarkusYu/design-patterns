package PizzaService.Pizza;

import PizzaService.IngredientFactory.*;

public class NYStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(Type type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type == Type.CHEESE) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type == Type.CLAM) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}