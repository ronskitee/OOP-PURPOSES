// Open/Closed Principle (OCP) suggests that software entities
// (classes, modules, and functions) should be open for extension,
// but closed for modification.
//
// Here is an example of bad implementation
//
//      class DiscountCalculator {
//          public double calculate(Customer customer) {
//              if (customer.getType() == CustomerType.SENIOR) {
//                  return 0.05;
//              } else if (customer.getType() == CustomerType.MEMBER){
//                  return 0.02;
//              } else {
//                  return 0.0;
//              }
//          }
//      }
//
// This violates OCP because everytime you add a new customer type, you 
// have to modify this class.
//
public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(150.00, new MemberDiscount());
        System.out.println("Total Amount: " + order1.getTotal());
    }
}

// To comply with OCP, we'll have to define different discount types
// that could be applied to an order without the dependence on customer types
interface Discount {
    public double calculate(double amount);
}

// TODO: Ensure that would classes implements our discount
class SeniorDiscount implements ??? {
    public double calculate(double amount) {
        return amount * 0.05;
    }
}

class MemberDiscount implements ??? {
    public double calculate(double amount) {
        return amount * 0.02;
    }
}

class RegularCustomerDiscount implements ??? {
    public double calculate(double amount) {
        return 0.0;
    }
}

class Order {
    private double amount = 0.0;
    private Discount discount;

    public Order(double amount, Discount discount) {
        this.amount = amount;
        this.discount = discount;
    }

    public double getTotal() {
        return this.amount - this.discount.calculate(this.amount);
    }
}
