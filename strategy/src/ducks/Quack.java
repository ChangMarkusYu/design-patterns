package ducks;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack() method called in class: \"Quack\".");
    }
}
