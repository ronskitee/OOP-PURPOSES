// It is also possible to for a class to inherit from another sub-class.
//
//      Dog --inherits-> Canine --inherits-> Animal
//
// This is usually referred to as Multilevel inheritance

public class Main {
    public static void main(String[] args) {
        Dog blues = new Dog();
        blues.eat();
        blues.speak();
    }
}

// TODO: complete our multilevel inheritance
class Animal {
    public void speak() {
        System.out.println("Animal is speaking...");
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }
}

class Canine extends ??? {
    @Override
    public void speak() {
        System.out.println("Canine is speaking...");
    }
}

class Dog extends ??? {
    // declaring a function that already exists in the super would override it.
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void speak() {
        System.out.println("Dog is barking...");
    }
}