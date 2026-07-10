// Here we have an abstract class for Person which has name property set using the constructor
// and fetched using a getter.

public class Main {
    public static void main(String[] args) {
        Student juan = new Student("Juan", "BSCS");
        System.out.println(juan.getName());
        System.out.println(juan.getCourse());
    }
}

??? class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    // TODO: implement getName()
}

class Student extends Person {
    private String course;

    public Student (String name, String course) {
        super(name); // call the constructor from our parent class
        this.course = course;
    }

    // TODO: implement getCourse()
}