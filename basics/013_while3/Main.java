// `break` statement is used to jump out of a loop

public class Main {
  public static void main(String[] args) {
    int num = 41;
    // Given 40 to 1. Stop the countdown once
    // the current number is divisible by 15.
    while (num > 1) {
      num--;
      if (num % 15 == 0) break;
      System.out.print(num + " ");
    }
  }
}
