// lazy initialization. Not thread safe.
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    public static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoilded()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoilded()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoilded() {
        return boiled;
    }
}