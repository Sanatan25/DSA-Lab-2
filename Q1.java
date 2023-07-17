import java.util.*;
class Phone {
	int area_code;
	int exchange;
	int number;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Area code");
		area_code = sc.nextInt();
		System.out.println("Enter the exchange number");
		exchange = sc.nextInt();
		System.out.println("Enter the number");
		number = sc.nextInt();
		
	}
	public void display() {
		System.out.println(area_code+" "+exchange+" "+number);
		
	}
}





public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		p1.area_code = 122;
		p1.exchange = 233;
		p1.number = 3445;
		
		
		
		p2.input();
		p2.display();
		p1.display();
		
		
		

	}

}
