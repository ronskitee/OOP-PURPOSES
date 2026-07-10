// While using `private` proves some benefits, it would limit us in accessing
// the identified resource. Thus, Getter and Setter is introduced.
// In this way, we could protect our data make our code more secure.

public class Main {
    // DO NOT ADD OR REMOVE CODE IN MAIN
    public static void main(String[] args) {
        Car civic = new Car("Honda", "Civic");
        civic.setColor("red");

        System.out.println(civic.getMake() + " " + civic.getModel() + " " + civic.getColor());
    }
}

class Car {
    private String make;
    private String model;
    private String color;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;

        System.out.println("A new car is created.");
    }

    // This is our getter for our model
    public String getMake() {
        return this.make;
    }

    // This is our getter for our model
    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    // Here is our setter for `color`.
    // This should set color attribute based from the argument
    public void setColor(String color) {

    }
}