public abstract class Product implements Purchasable {

    private int id;
    private String name;
    private String writer;
    private double cost;
    private String publisher;
    private int quantity;

    public Product(int id, String name, String writer,
                   double cost, String publisher, int quantity) {

        this.id = id;
        this.name = name;
        this.writer = writer;
        this.cost = cost;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    public double getPrice() {
        return cost;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String name) {
        this.name = name;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPrice(double cost) {
        this.cost = cost;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void displayDetails() {

        System.out.println("Product ID: " + id);
        System.out.println("Title: " + name);
        System.out.println("Author: " + writer);
        System.out.println("Price: ₱" + cost);
        System.out.println("Publisher: " + publisher);
        System.out.println("Stock: " + quantity);
    }

    public void updateQuantity(int amount) {
        quantity += amount;
        System.out.println("Current Stock: " + quantity);
    }
}