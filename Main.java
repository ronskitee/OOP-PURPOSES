import java.util.*;

// =========================================================================
// 1. CORE EXECUTION ENGINE
// =========================================================================
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Cart cart = new Cart();
    private static Customer currentCustomer = null;

    private static final Product[] CATALOG = {
        new Book(1, "Java Basics", 500.00),
        new EBook(2, "OOP Guide", 300.00),
        new Magazine(3, "Tech Monthly", 150.00)
    };

    public static void main(String[] args) {
        while (true) {
            displayMainMenu();
            int choice = getIntegerInput();
            executeMenuChoice(choice);
        }
    }

    private static void displayMainMenu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Login\n2. Browse Products\n3. View Cart\n4. Checkout\n5. Exit");
        System.out.print("Select choice: ");
    }

    private static void executeMenuChoice(int choice) {
        switch (choice) {
            case 1 -> handleLogin();
            case 2 -> handleProductBrowsing();
            case 3 -> handleViewCart();
            case 4 -> handleCheckout();
            case 5 -> handleExit();
            default -> System.out.println("Invalid selection. Try again.");
        }
    }

    private static void handleLogin() {
        System.out.print("Name: ");
        currentCustomer = new Customer(scanner.nextLine());
        currentCustomer.login();
    }

    private static void handleProductBrowsing() {
        System.out.println("\n--- Available Items ---");
        for (int i = 0; i < CATALOG.length; i++) {
            System.out.print((i + 1) + ". ");
            CATALOG[i].displayInfo();
        }
        
        System.out.print("Choose product number to add to cart (0 to cancel): ");
        int index = getIntegerInput();
        if (index > 0 && index <= CATALOG.length) {
            Product selectedProduct = CATALOG[index - 1];
            cart.add(selectedProduct);
            System.out.printf("\"%s\" added to cart.%n", selectedProduct.getTitle());
        }
    }

    private static void handleViewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("\n--- Your Cart ---");
        cart.getItems().forEach(Product::displayInfo);
        System.out.printf("Current Total: ₱%.2f%n", cart.calculateTotal());
    }

    private static void handleCheckout() {
        if (currentCustomer == null) {
            System.out.println("Access Denied: Please Login first.");
            return;
        }
        if (cart.isEmpty()) {
            System.out.println("Checkout Rejected: Your cart is empty.");
            return;
        }

        System.out.print("Enter Target Delivery Address: ");
        DeliveryAddress address = new DeliveryAddress(scanner.nextLine());
        
        System.out.println("\n--- Processing Transaction ---");
        new PaymentProcessor().process(cart.calculateTotal());
        System.out.println("Dispatched to: " + address.getAddress());
        cart.clear();
    }

    private static void handleExit() {
        System.out.println("Session closed. Thank you!");
        scanner.close();
        System.exit(0);
    }

    private static int getIntegerInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Please provide a valid number.");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        return input;
    }
}

// =========================================================================
// 2. DOMAIN MODELS (DATA & ENCAPSULATION)
// =========================================================================
abstract class Product {
    private final int id;
    private final String title;
    private final double price;

    protected Product(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public String getTitle() { return title; }
    public double getPrice() { return price; }

    public void displayInfo() {
        System.out.printf("%s - ₱%.2f%n", title, price);
    }
}

class Book extends Product {
    public Book(int id, String title, double price) { super(id, title, price); }
    @Override public void displayInfo() { System.out.print("[Book] "); super.displayInfo(); }
}

class EBook extends Product {
    public EBook(int id, String title, double price) { super(id, title, price); }
    @Override public void displayInfo() { System.out.print("[EBook] "); super.displayInfo(); }
}

class Magazine extends Product {
    public Magazine(int id, String title, double price) { super(id, title, price); }
    @Override public void displayInfo() { System.out.print("[Magazine] "); super.displayInfo(); }
}

class Customer {
    private final String name;
    public Customer(String name) { this.name = name; }
    public void login() { System.out.printf("Welcome back, %s!%n", name); }
}

class DeliveryAddress {
    private final String address;
    public DeliveryAddress(String address) { this.address = address; }
    public String getAddress() { return address; }
}

// =========================================================================
// 3. BUSINESS LOGIC SERVICES
// =========================================================================
class Cart {
    private final List<Product> items = new ArrayList<>();

    public void add(Product product) { items.add(product); }
    public List<Product> getItems() { return Collections.unmodifiableList(items); }
    public void clear() { items.clear(); }
    public boolean isEmpty() { return items.isEmpty(); }

    public double calculateTotal() {
        return items.stream()
                    .mapToDouble(Product::getPrice)
                    .sum();
    }
}

class PaymentProcessor {
    public void process(double amount) {
        System.out.printf("Payment of ₱%.2f processed successfully.%n", amount);
    }
}
