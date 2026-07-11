public class Customer {

    private int id;
    private String fullName;
    private String userEmail;
    private String userPassword;

    public Customer(int id, String fullName, String userEmail, String userPassword) {

        this.id = id;
        this.fullName = fullName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public void registerAccount() {
        System.out.println(fullName + " has successfully registered.");
    }

    public void loginAccount() {
        System.out.println(fullName + " has logged in.");
    }

    public void logoutAccount() {
        System.out.println(fullName + " has logged out.");
    }

    public void browseProducts() {
        System.out.println(fullName + " is browsing the products.");
    }

    public void orderProduct() {
        System.out.println(fullName + " placed an order.");
    }

    public void cancelProductOrder() {
        System.out.println(fullName + " cancelled the order.");
    }
}