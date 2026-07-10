package structural.composite;

import java.util.ArrayList;
import java.util.List;

// Common Component
interface InventoryComponent {
    void list();

    String getName(); // for identifying the component
}

// Leaf
class Product implements InventoryComponent {
    private String brand;
    private String name;
    private double price;
    private int quantity;

    public Product(String brand, String name, double price, int quantity) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void list() {
        System.out.println(brand + " " + name + " - ₱" + price + " x " + quantity);
    }

    @Override
    public String getName() {
        return brand + "-" + name;
    }
}

// Composite
class Inventory implements InventoryComponent {
    private String name;
    private List<InventoryComponent> components = new ArrayList<>();

    public Inventory(String name) {
        this.name = name;
    }

    public void add(InventoryComponent component) {
        components.add(component);
    }

    public void remove(String componentName) {
        components.removeIf(c -> c.getName().equals(componentName));
    }

    @Override
    public void list() {
        System.out.println("Inventory: " + name);
        for (InventoryComponent component : components) {
            component.list();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        Product coke = new Product("Coca-Cola", "Coke Sakto", 13.55, 10);
        Product royal = new Product("Coca-Cola", "Royal", 13.55, 10);

        Inventory softDrinks = new Inventory("Soft Drinks");
        softDrinks.add(coke);
        softDrinks.add(royal);

        Product water = new Product("Wilkins", "Bottled Water", 10.00, 5);
        Inventory bottled = new Inventory("Bottled Items");
        bottled.add(water);
        bottled.add(softDrinks); // Nested inventory

        bottled.list();
    }
}
