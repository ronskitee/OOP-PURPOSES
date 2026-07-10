// Encapsulation is the concept of bundling data (attributes and methods) into a single unit.
// It involves restricting access to some of the data, which is usually done by using
// access modifiers like `private`, `protected`, and `public`.

public class Main {
    public static void main(String[] args) {
        Car civic = new Car();
        // Assign make and model values to our object
        ???.make = "Honda";
        ???.model = "Civic";
    }
}

class Car {
    // not specifiying any access modifier to an attribute would default to `package-private`.
    // `package-private` meaning it would only be accessible within the same package.
    String make;
    String model;

    public Car() {
        System.out.println("A car is created.");
    }
}