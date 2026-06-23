package CommandPatternExample;

public class TestCommand {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightonCommand(light);
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

    }
}
