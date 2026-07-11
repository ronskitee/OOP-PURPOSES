
public class Product{
private int id;private String title;private double price;
public Product(int id,String title,double price){this.id=id;this.title=title;this.price=price;}
public String getTitle(){return title;} public double getPrice(){return price;}
public void displayInfo(){System.out.println(id+" - "+title+" : ₱"+price);}
}
