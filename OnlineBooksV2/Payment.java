public class Payment {

    private int id;
    private String method;
    private double totalAmount;
    private String status;

    public Payment(int id, String method, double totalAmount, String status) {

        this.id = id;
        this.method = method;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public void makePayment() {
        status = "Paid";
        System.out.println("Payment was successful.");
    }

    public void checkPayment() {
        System.out.println("Payment has been verified.");
    }

    public void cancelPayment() {
        status = "Cancelled";
        System.out.println("Payment has been cancelled.");
    }
}