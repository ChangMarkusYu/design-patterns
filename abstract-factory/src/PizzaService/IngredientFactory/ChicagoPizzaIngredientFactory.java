package PizzaService.IngredientFactory;

import PizzaService.Pizza.Dough.*;
import PizzaService.Pizza.Sauce.*;
import PizzaService.Pizza.Cheese.*;
import PizzaService.Pizza.Clam.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ExtraThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    public Clam createClam() {
        return new FrozenClam();
    }
}