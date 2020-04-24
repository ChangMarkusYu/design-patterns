
public class EagerSingleton {

    // initialized once the class is loaded. Guaranteed thread safety.
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    public int state;

    private EagerSingleton() {
        state = 0;
    }

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }

    public String toString() {
        return "Eager Singleton";
    }
}