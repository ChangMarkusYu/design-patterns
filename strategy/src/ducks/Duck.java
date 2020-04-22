package ducks;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public Duck() {
        flyBehavior = null;
        quackBehavior = null;
    }

    public Duck(FlyBehavior fb, QuackBehavior qb) {
        setFlyBehavior(fb);
        setQuackBehavior(qb);
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("swim() method called in class: \"Duck\".");
    }

    public void performFly() {
        try{
            flyBehavior.fly();
        }
        catch (NullPointerException e) {
            System.err.println("Set flyBehavior first.");
        }
        catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public void performQuack() {
        try{
            quackBehavior.quack();
        }
        catch (NullPointerException e) {
            System.err.println("Set quackBehavior first.");
        }
        catch (Exception e) {
            System.err.println(e.toString());
        }

    }
}
