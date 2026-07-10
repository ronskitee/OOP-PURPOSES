// `continue` statement is used to skip the current iteration
//  and proceed with the next iteration
public class Main {
  public static void main(String[] args) {
    int num = 0;

    // print all numbers between 1 and 20 that are not divisible by
    // 3 or 5
    while (num <= 20) {
      num++;
      if (num % 3 == 0 || num % 5 == 0) continue;
      System.out.print(num + " ");
    }
  }
}
