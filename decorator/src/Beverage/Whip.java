package Beverage;

public class Whip extends CondimentDecorator{

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 1.0;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
