package structural.proxy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor proxy = new PaymentProxy(new GCashPaymentProcessor());
        proxy.pay("09123458123", 200.0f);
    }
}

interface PaymentProcessor {
    void pay(String accout, double amount);
}

class GCashPaymentProcessor implements PaymentProcessor {
    @Override
    public void pay(String account, double amount) {
        System.out.printf("Sending %.2f to %s\n", amount, account);
    }
}

class PaymentProxy implements PaymentProcessor {
    PaymentProcessor paymentProcessor;

    public PaymentProxy(PaymentProcessor payment) {
        this.paymentProcessor = payment;
    }

    public void pay(String account, double amount) {
        System.out.printf("Paying with %s\n", this.paymentProcessor.getClass().getSimpleName());
        this.paymentProcessor.pay(account, amount);
        System.out.printf("Payment completed with %s\n", this.paymentProcessor.getClass().getSimpleName());
    }
}
