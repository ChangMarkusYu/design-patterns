package ducks;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("display() method called in class: \"MallardDuck\".");
    }

    @Override
    public void swim() {
        System.out.println("swim() method called in class: \"MallardDuck\".");
    }
}
