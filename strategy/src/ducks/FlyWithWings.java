package ducks;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly() method called in class: \"FlyWithWings\".");
    }
}
