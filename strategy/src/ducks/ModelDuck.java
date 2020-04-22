package ducks;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyWithRockets();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("display() method called in class: \"ModelDuck\".");
    }

    @Override
    public void swim() {
        System.out.println("swim() method called in class: \"ModelDuck\".");
    }
}
