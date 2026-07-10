// Java allows us to declare multiple functions with the same name,
// as long as they differ in the number or types of parameters --
// This is called function overloading.
public class Main {
    // Here is the same function we have previously
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Here is a new function with the same name `isEven`, but
    // with a new parameter used to determined whether we'd print
    // the result as human-readable text.
    private static boolean isEven(int num, boolean print) {
        boolean isNumEven = num % 2 == 0;
        if (isNumEven == true) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        return isNumEven;
    }

    public static void main(String[] args) {
        System.out.println(isEven(33));
        System.out.println(isEven(50, true));
    }
}
