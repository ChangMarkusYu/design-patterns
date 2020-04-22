package ducks;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("display() method called in class: \"RubberDuck\".");
    }

    @Override
    public void swim() {
        System.out.println("swim() method called in class: \"RubberDuck\".");
    }
}
