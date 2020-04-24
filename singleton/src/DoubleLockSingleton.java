// Use double-checked locking. Thread safe and reduce the cost of synchronization
public class DoubleLockSingleton {

    private volatile static DoubleLockSingleton uniqueInstance;

    public int state;

    private DoubleLockSingleton() {
        state = 0;
    }

    public static DoubleLockSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleLockSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleLockSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public String toString() {
        return "Double-Checked Locking Singleton";
    }
}