// Inheritance is a mechanism that allows a class (sub-class) to inherit properties and behaviors from
// another class (super).
//
// To apply inheritance, use `extends` keyword to specify the super class.
//      class Car extends Vehicle {
//      }

public class Main {
    public static void main(String[] args) {
        Dog blues = new Dog();
        blues.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}

// `Dog` should inherit from `Animal`.
??? Dog ??? Animal {
}

// This form of inheritance where in a sub-class is derived from only one super class is called Single Inheritance.