// In order for us to convert non-numeric with explicit type casting
// with an exception to boolean type (as it could not be converted to
// any type).

public class Main {
    public static void main(String[] args) {
        // 65 === 'A' in ASCII
        int intVar = 97; // @TODO:update the value of `intVar` to have the decimal value for `a`
        char charVar = (char) intVar;
        short shortVar = (short) charVar;

        System.out.println(charVar);
        System.out.println(shortVar);
    }
}
