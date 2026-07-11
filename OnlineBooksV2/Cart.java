import java.util.ArrayList;

public class Cart {

    private int id;
    private ArrayList<Product> itemList;

    public Cart(int id) {
        this.id = id;
        itemList = new ArrayList<Product>();
    }

    public void addItem(Product item) {
        itemList.add(item);
        System.out.println(item.getTitle() + " has been added to your cart.");
    }

    public void removeItem(Product item) {
        itemList.remove(item);
        System.out.println(item.getTitle() + " has been removed from your cart.");
    }

    public void viewCart() {

        double totalPrice = 0;

        System.out.println("\n========== MY CART ==========");

        for (Product item : itemList) {
            System.out.println(item.getTitle() + " - ₱" + item.getPrice());
            totalPrice += item.getPrice();
        }

        System.out.println("-----------------------------");
        System.out.println("Total Price: ₱" + totalPrice);
    }
}