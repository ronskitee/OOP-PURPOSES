// `for` is also used to cycle through elements in an iteratable.
//
//        String[] fruits = {"Apple", "Banana", "Cherry"};
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
