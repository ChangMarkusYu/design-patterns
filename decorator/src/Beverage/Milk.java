package Beverage;

public class Milk extends CondimentDecorator{

    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 1.5;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
