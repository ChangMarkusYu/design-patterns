package ducks;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack() method called in class: \"Squeak\".");
    }
}
