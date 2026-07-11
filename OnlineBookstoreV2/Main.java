
import java.util.*;
public class Main{
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
Customer c=null; Cart cart=new Cart(); Payment pay=new Payment(); DeliveryAddress addr=null;
Product[] store={new Book(1,"Java Basics",500),new EBook(2,"OOP Guide PDF",300),new Magazine(3,"Tech Monthly",150)};
while(true){
System.out.println("\n1.Register/Login\n2.View Products\n3.View Cart\n4.Checkout\n5.Exit");
int ch=sc.nextInt();sc.nextLine();
if(ch==1){System.out.print("Name: ");c=new Customer(sc.nextLine());System.out.println("Welcome "+c.getName());}
else if(ch==2){
for(int i=0;i<store.length;i++){System.out.print((i+1)+". ");store[i].displayInfo();}
System.out.print("Add item (0 cancel): ");int x=sc.nextInt();sc.nextLine();if(x>0&&x<=store.length)cart.add(store[x-1]);
}
else if(ch==3){cart.view();System.out.print("Remove item number (0 skip): ");int r=sc.nextInt();sc.nextLine();if(r>0)cart.remove(r-1);}
else if(ch==4){
if(cart.empty()){System.out.println("Cart empty.");continue;}
System.out.print("Delivery address: ");addr=new DeliveryAddress(sc.nextLine());
cart.view();pay.process(cart.total());System.out.println("Deliver to: "+addr.getAddress());
}
else break;
}
}}
