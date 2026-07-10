// Liskov Substitution Principle
//
// states that "Objects in a program should be replaceable with instances
// of their subtypes without altering the correctness of that program"
//
// Here is an example. A Pigeon is a kind of bird and it can fly.
//
// abstract class Bird {
//     public void fly() {
//     }
// }
//
// class Pigeon extends Bird {
//     @Override
//     public void fly() {
//         System.out.println("Hello World");
//     }
// }
//
// But, when would our example go south?
//
// Can a Pengiun fly? NO! thus leaving us an option 
// to throw an exception.
//
// class Penguin extends Bird {
//     @Override
//     public void fly() {
//         throw new Exception("Can't go high!");
//     }
// }
// 
// This implementation cleary violates LSP. 
// To solve this issue we must rethink our hierarchy.
// 
//      Bird <- FlyingBird <- Pigeon
//      Bird <- SwimmingBird <- Penguin
//

public class Main {
    public static void main(String[] args) {
        Pigeon b = new Pigeon();
        b.fly();

        Penguin p = new Penguin();
        p.swim();
    }
}

abstract class Bird {
    public void eat() {
        System.out.println("eating...");
    }
}

abstract class FlyingBird extends Bird {
    abstract public void fly();
}

abstract class SwimmingBird extends Bird {
    abstract public void swim();
}

// @TODO: complete the heirarchy
class Pigeon extends ??? {
    @Override
    public void fly() {
        System.out.println("flying...");
    }
}

class Penguin extends ??? {
    @Override
    public void swim() {
        System.out.println("swimming...");
    }
}