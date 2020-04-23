package PizzaService.IngredientFactory;

import PizzaService.Pizza.Dough.*;
import PizzaService.Pizza.Sauce.*;
import PizzaService.Pizza.Cheese.*;
import PizzaService.Pizza.Clam.*;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Clam createClam();
}