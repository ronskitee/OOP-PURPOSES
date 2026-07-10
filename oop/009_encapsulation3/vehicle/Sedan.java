package vehicle;

public class Sedan extends Car {
    public void start() {
        System.out.println("Starting car...");
        this.startEngine();
    }
}