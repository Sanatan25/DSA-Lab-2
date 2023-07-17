import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product(1,1000);
		Product p2 = new Product(2,3);
		Product p3 = new Product(3,4);
		Product p4 = new Product(4,5);
		Product p5 = new Product(5,6);
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
		
		System.out.println(tot_price);
		
		
		
	}

}


class Product {
	int pid;
	 double price;
	double tot_price;
	
	
	Product(int pid,double price) {
		this.pid = pid;
		this.price= price;
		tot_price += price;
		
	}
	
	public void display() {
		System.out.println("pid is " + pid);
		System.out.println("price is " + price);
		
	}
}
