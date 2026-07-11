public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                1,
                "Roniel",
                "roniel@email.com",
                "1234"
        );

        Book book = new Book(
                101,
                "Java Programming",
                "John Smith",
                599.00,
                "TechBooks",
                20,
                "978-1234567890",
                350
        );

        Magazine magazine = new Magazine(
                102,
                "Tech Monthly",
                "Editorial Team",
                199.00,
                "TechPress",
                15,
                12,
                "July 2026"
        );

        EBook ebook = new EBook(
                103,
                "OOP Fundamentals",
                "Jane Doe",
                299.00,
                "DigitalBooks",
                100,
                "oop.pdf",
                5.2,
                "https://download.example.com/oop.pdf"
        );

        Cart cart = new Cart(1);

        customer.registerAccount();
        customer.loginAccount();
        customer.browseProducts();

        cart.addItem(book);
        cart.addItem(magazine);
        cart.addItem(ebook);

        System.out.println("\n========== PRODUCT DETAILS ==========");

        Product[] items = {book, magazine, ebook};

        for (Product item : items) {
            item.displayDetails();
            System.out.println();
        }

        cart.viewCart();

        Payment payment = new Payment(
                1,
                "GCash",
                1097.00,
                "Pending"
        );

        payment.makePayment();
        payment.checkPayment();

        book.shipBook();
        magazine.shipMagazine();
        ebook.download();

        customer.orderProduct();
        customer.logoutAccount();
    }
}