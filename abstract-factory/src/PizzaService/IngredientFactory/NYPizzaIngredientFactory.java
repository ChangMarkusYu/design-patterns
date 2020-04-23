package PizzaService.IngredientFactory;

import PizzaService.Pizza.Dough.*;
import PizzaService.Pizza.Sauce.*;
import PizzaService.Pizza.Cheese.*;
import PizzaService.Pizza.Clam.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Clam createClam() {
        return new FreshClam();
    }
}