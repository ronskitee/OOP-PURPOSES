// While statements create a loop that runs while the 
// condition is true.
//
//
//    while (condition) {
//      // something to do
//      condition = false
//    }
//
//  Condition must be boolean value.
//  Boolean value could be retrieve to the use of
//  comparison operations we learn in `if` statements
//

public class Main {
  public static void main(String[] args) {
    int n = 2;

    // Stop our loop until `n` reaches 1024
    while (n <= 1024) {
      System.out.println(n);
      n *= 2;
    }
  }
}
