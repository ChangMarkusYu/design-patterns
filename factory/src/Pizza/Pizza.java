package Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("prepare() method in class: \"Pizza\": ");
        for (String topping : toppings) {
            System.out.println("\t" + topping + ",");
        }
    }

    void bake() {
        System.out.println("bake() method in class: \"Pizza\".");
    }

    void cut() {
        System.out.println("cut() method in class: \"Pizza\".");
    }

    void box() {
        System.out.println("box() method in class: \"Pizza\".");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder msg = new StringBuilder(name + ", " + dough + " with " + sauce + ", toppings: ");
        for (String topping : toppings) {
            msg.append(topping + ", ");
        }
        return msg.toString();
    }
}