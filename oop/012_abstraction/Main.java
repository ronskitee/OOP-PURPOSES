// Abstraction is the process of hiding the details and showing only essentials to the user.
//
// `abstract` keyword could be applied to classes and methods. Abstract classes cannot be instantiated (i.e. you cannot
// create objects from it).
//
// An abstract class could contain:
//  - abstract methods: methods that doesn't have body (only signature).
//  - concreate methods: methods with body/implementation
//  - fields/members
//
// The class extending the abstract class should be the one to provide an implementation for each abstract method
//

public class Main {
    public static void main(String[] args) {
        CellularPhone cp = new CellularPhone();
        cp.sms("911", "Help");
        cp.call("911");
    }
}

// In this example, let's think of a Phone as an abstract class. A phone could make call and send SMS messages.
??? class Phone {
    // Here, we'll only declare the signature for our sms method (abstract method)
    ??? public void sms(String number, String msg);

    // and for the call, let's make it a concrete class (with partial/complete implementation)
    // Ooops! something is wrong with our function declaration. Fix it.
    private void call(String number) {
        System.out.println("Calling " + number);
    }
}

// A CellularPhone is a type of Phone.
class CellularPhone extends Phone {
    public void sms(String number, String msg) {
        System.out.printf("Sending SMS to %s with '%s'\n", number, msg);
    }
}
