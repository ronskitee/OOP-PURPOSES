// While the `public` access modifier allows any class or member to be accessed from any package,
// it's not always the best choice. In some cases, you may only want to share certain members
// with specific classes, such as those within the same package or subclasses.
// In such scenarios, using `protected` (or even default/package-private) access is more appropriate.

// A `protected` member is only visible to the same class, package, and sub-classes.

// Here is an example:
// `startEngine` is a protected member of `Car`. That means any class within the `vehicle` package or sub-classes could
// use the `startEngine`.

// `Sedan` is a sub-class of `Car`. That means it could call the `startEngine`.
//  Since this `Main` is not part of the `vehicle` package, we're are not allowed to call `startEngine`.
// Fix our code below.

import vehicle.*;

public class Main {
    public static void main(String[] args) {
        Sedan car = new Sedan();
        car.startEngine(); // <---- See vehicle.Sedan class for the proper method to call
    }
}