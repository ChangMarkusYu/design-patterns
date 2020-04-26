public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    private final int COMMAND_NUM = 6;

    public RemoteControl() {
        onCommands = new Command[COMMAND_NUM];
        offCommands = new Command[COMMAND_NUM];

        Command noCommand = new NoCommand();
        for (int i = 0; i < COMMAND_NUM; ++i) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot >= COMMAND_NUM) {
            return;
        }
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for (int i = 0; i < COMMAND_NUM; ++i) {
            stringBuilder
                    .append("[slot " + i + "] " + onCommands[i].toString() + "\t" + offCommands[i].toString() + "\n");
        }
        return stringBuilder.toString();
    }
}