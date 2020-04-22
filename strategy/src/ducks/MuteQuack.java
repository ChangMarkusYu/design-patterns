package ducks;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack() method called in class: \"MuteQuack\".");
    }
}
