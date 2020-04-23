package PizzaService.Pizza;

import PizzaService.Pizza.Dough.*;
import PizzaService.Pizza.Sauce.*;
import PizzaService.Pizza.Cheese.*;
import PizzaService.Pizza.Clam.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clam clam;

    abstract void prepare();

    void bake() {
        System.out.println("bake() method in class: \"Pizza\".");
    }

    void cut() {
        System.out.println("cut() method in class: \"Pizza\".");
    }

    void box() {
        System.out.println("box() method in class: \"Pizza\".");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuilder msg = new StringBuilder(name);
        if (dough != null) {
            msg.append(", " + dough.toString());
        }
        if (sauce != null) {
            msg.append(", " + sauce.toString());
        }
        if (cheese != null) {
            msg.append(", " + cheese.toString());
        }
        if (clam != null) {
            msg.append(", " + clam.toString());
        }
        return msg.toString();
    }
}