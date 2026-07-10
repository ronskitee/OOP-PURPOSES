// Ternary operator is a shorthard for `if-else` statement.
//
//    condition ? expression1 : expression2
//
public class Main {
  public static void main(String[] args) {
    double total = 200.0;
    boolean isSenior = true;

    // Apply a 5% discount to customer if he/she is a senior
    double discount = isSenior ? total * 0.05 : 0.00;
    double grandTotal = total - discount;

    System.out.println(String.format("Grand Total: %.2f", grandTotal));
  }
}
