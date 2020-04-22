import ducks.*;

public class driver {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck modelDuck = new ModelDuck();

        System.out.println("Mallard Duck: ");
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("\nRubber Duck: ");
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println("\nModel Duck: ");
        modelDuck.performFly();
        modelDuck.performQuack();

        System.out.println("\nChanging algorithms on the fly: ");
        modelDuck.setQuackBehavior(new Squeak());
        rubberDuck.setFlyBehavior(new FlyWithRockets());

        System.out.println("\nRubber Duck: ");
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println("\nModel Duck: ");
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
