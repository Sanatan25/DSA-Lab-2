import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deposit d1 = new Deposit();
		
		d1.principal = 1000;
		d1.time = 4;
		d1.rate = 3;
		d1.calc();
		d1.display();

	}

}

class Deposit {
	long principal;
	int time;
	double rate;
	double total;
	
	
	Deposit() {
		
	}
	Deposit(long principal,int time,double rate) {
		this.principal = principal;
		this.time = time;
		this.rate = rate;
	}
	Deposit(long principal, int time) {
		this.principal = principal;
		this.time = time;
	}
	Deposit(long principal,double rate) {
		this.principal = principal;
		this.rate = rate;
	}
	
	public void display() {
		System.out.println(principal);
		System.out.println(time);
		System.out.println(rate);
		System.out.println(total);
	}
	public void calc() {
		total = principal+(principal*rate*time)/100;
	}
}
