
import java.util.ArrayList;
public class Cart{
ArrayList<Product> items=new ArrayList<Product>();
public void add(Product p){items.add(p);System.out.println(p.getTitle()+" added.");}
public void remove(int i){if(i>=0&&i<items.size()){System.out.println(items.remove(i).getTitle()+" removed.");}}
public void view(){double t=0;for(int i=0;i<items.size();i++){System.out.print((i+1)+". ");items.get(i).displayInfo();t+=items.get(i).getPrice();}System.out.println("Total: ₱"+t);}
public double total(){double t=0;for(Product p:items)t+=p.getPrice();return t;}
public boolean empty(){return items.isEmpty();}
}
