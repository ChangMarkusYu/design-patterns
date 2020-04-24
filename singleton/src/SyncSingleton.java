
public class SyncSingleton {

    private static SyncSingleton uniqueInstance;

    public int state;

    private SyncSingleton() {
        state = 0;
    }

    // Thread safe, but relatively inefficient because we no longer need
    // synchronization after we've set uniqueInstance once.
    public static synchronized SyncSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SyncSingleton();
        }

        return uniqueInstance;
    }

    public String toString() {
        return "Synchronized Singleton";
    }
}