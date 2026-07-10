// In Java, there are 2 ways to cast a numeric primitive.
// 
// 1. Implicit -- Happens when the source type has smaller range than the target type
// 2. Explicit -- Has to be done when source type has much larger range

public class Main {
    public static void main(String[] args) {
        // Implicit
        byte byteVar = 32;
        int intVar = byteVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;

        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);

        // Explicit
        double doubleVar2 = 32.0d;
        float floatVar2 = (float) doubleVar2;
        long longVar2 = (long) floatVar2;
        int intVar2 = (int) longVar;
        // @TODO Explicit cast `intVar2` to byte
        byte byteVar2 = (byte) intVar2;

        System.out.println(doubleVar2);
        System.out.println(floatVar2);
        System.out.println(longVar2);
        System.out.println(intVar2);
        System.out.println(byteVar2);
    }
}
