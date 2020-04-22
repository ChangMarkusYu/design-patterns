package ducks;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly() method called in class: \"FlyNoWay\".");
    }
}
