package CommandPatternExample;

public class LightonCommand implements Command {
    private Light light;

    public LightonCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

}
