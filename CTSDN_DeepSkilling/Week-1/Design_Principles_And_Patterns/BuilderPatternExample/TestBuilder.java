package BuilderPatternExample;

public class TestBuilder {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCPU("Intel Core i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        computer.displayConfiguration();
    }
}
