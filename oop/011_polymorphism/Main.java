// Polymorphism means "many forms". It allows objects of different classes to be treated as objects
// of a common superclass.
//
// Example, both Rectangle and Circle are forms of Shape. Each shape has a different way to compute area
// TODO: Ensure that our code properly implements area computation

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        System.out.println("Area of Circle (10) = " + c1.area());

        Rectangle r1 = new Rectangle(10, 5);
        System.out.println("Area of Rectangle (10x5)" + r1.area());
    }
}

class Shape {
    public double area() {
        return 0;
    }
}

class Rectangle extends  ??? {
    private double h;
    private double w;

    public Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    @Override
    private int area() {
        return this.h * this.w;
    }
}

class Circle extends ??? {
    private double r;

    public Circle(double radius) {
        this.r = radius;
    }

    @Override
    private double area() {
        return Math.PI * Math.pow(this.r, 2);
    }
}