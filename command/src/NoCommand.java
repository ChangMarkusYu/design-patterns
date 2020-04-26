
public class NoCommand implements Command {

    public void execute() {
        return;
    }

    public void undo() {
        return;
    }

    public String toString() {
        return "NoCommand";
    }
}