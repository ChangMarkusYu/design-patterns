package ducks;

public class FlyWithRockets implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly() method called in class: \"FlyWithRockets\".");
    }
}
