// Same with `while` statements, `for loop` statements 
// allows us to repeat a block of code. 
//
//
// In order to create a `for loop`, we'll need 3 statements:
//
//  1. Executed (one time) before the start of loop
//  2. Condition for running the loop
//  3. Executed (everytime) after the code block
//
//    for (int i = 0; i < 3; i++) {
//      System.out.println(i);
//    }
//
public class Main {
  public static void main(String[] args) {
    // FizzBuzz is a traditional game. Given a range of numbers,
    // Replace numbers that passes these conditions:
    //  - Divisible by 3 with `Fizz`
    //  - Divisible by 5 with `Buzz`
    //  - Divisible by both 3 and 5: FizzBuzz
    //
    //  1
    //  2
    //  Fizz
    //  4
    //  Buzz
    //  Fizz
    //  7
    //  8
    //  Fizz
    //  Buzz
    //  11
    //  Fizz
    //  13
    //  14
    //  FizzBuzz
    for (int i = 1; i <= 15; i++) {

    if (i % 3 == 0 && i % 5 == 0) {
    	   System.out.println("FizzBuzz");
    	   }
    else if (i % 3 == 0) {
    	   System.out.println("Fizz");
    	   }
    else if (i % 5 == 0) {
           System.out.println("Buzz");
     }
     else {
    	   System.out.println(i);
    	   }
      }
   }
}
