import Beverage.*;
import IoDecorator.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class driver {
    public static void main(String[] args) {
        Beverage order1 = new Espresso();
        System.out.println("\nOrder #1: ");
        System.out.println(order1.getDescription() + ": $" + order1.cost());

        Beverage order2 = new DarkRoast();
        order2 = new Milk(order2);
        order2 = new Whip(order2);
        System.out.println("\nOrder #2: ");
        System.out.println(order2.getDescription() + ": $" + order2.cost());

        Beverage order3 = new HouseBlend();
        order3 = new Soy(order3);
        System.out.println("\nOrder #3: ");
        System.out.println(order3.getDescription() + ": $" + order3.cost());

        Beverage order4 = new Decaf();
        order4 = new Mocha(order4);
        order4 = new Whip(order4);
        System.out.println("\nOrder #4: ");
        System.out.println(order4.getDescription() + ": $" + order4.cost());

        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(System.in));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
