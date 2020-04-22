package Beverage;

public class Mocha extends CondimentDecorator{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 0.8;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
