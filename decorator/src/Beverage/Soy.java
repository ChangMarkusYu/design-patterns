package Beverage;

public class Soy extends CondimentDecorator{

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 2.0;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
