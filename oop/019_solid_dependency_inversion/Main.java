// Dependency Inversion Principle (DIP) defines that
// High-level modules should not depend on low-level modules. Both should
// depend on abstraction.
//
// Here is an example on how we could violate the DIP.
//
// abstract class Vehicle {
//     abstract public void move();
// }
//
// class Car extends Vehicle {
//     @Override
//     public void move() {
//         System.out.println("Car is moving...");
//     }
// }
//
// class Person {
//     private Car sportsCar;
//
//     public Person() {
//         this.sportsCar = new Car();
//     }
//
//     public void rideCar() {
//         this.sportsCar.move();
//     }
// }
//
// To ensure that our high-level module (`Person` in this case) is not dependent to the `Car`
// We'll have to leverage the abstraction for Vehicle. 
// This way any vehicle could be use by our high-level class (Person).

public class Main {
    public static void main(String[] args) {
        Car civic = new Car();
        Person juan = new Person();

        juan.ride(civic);
    }
}

abstract class Vehicle {
    abstract public void move();
}

class Car extends ??? {
    @Override
    public void ??? () {
        System.out.println("Car is moving...");
    }
}

class Person {
    Vehicle vehicle;

    public void ride (Vehicle v) {
        this.vehicle = v;
        this.vehicle.move();
    } 
}
