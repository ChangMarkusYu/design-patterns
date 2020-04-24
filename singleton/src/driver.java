public class driver {
    public static void main(String[] args) {
        SyncSingleton syncSingleton = SyncSingleton.getInstance();
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        DoubleLockSingleton doubleLockSingleton = DoubleLockSingleton.getInstance();

        System.out.println("\n" + syncSingleton.toString() + ": ");
        syncSingleton.state = 20;
        SyncSingleton syncSingleton2 = SyncSingleton.getInstance();
        System.out.println("state: " + syncSingleton2.state);
        syncSingleton2.state = 35;
        System.out.println("state: " + syncSingleton.state);

        System.out.println("\n" + eagerSingleton.toString() + ": ");
        eagerSingleton.state = 50;
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("state: " + eagerSingleton2.state);
        eagerSingleton2.state = 115;
        System.out.println("state: " + eagerSingleton.state);

        System.out.println("\n" + doubleLockSingleton.toString() + ": ");
        doubleLockSingleton.state = 250;
        DoubleLockSingleton doubleLockSingleton2 = DoubleLockSingleton.getInstance();
        System.out.println("state: " + doubleLockSingleton2.state);
        doubleLockSingleton2.state = 75;
        System.out.println("state: " + doubleLockSingleton.state);
    }
}