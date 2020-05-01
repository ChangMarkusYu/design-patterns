import Duck.*;

public class driver {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("\nMalalrd Duck: ");
        testDuck(mallardDuck);

        System.out.println("\nTurkey: ");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}