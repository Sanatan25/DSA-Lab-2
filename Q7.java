import java.util.*;

class Person {
	String name;
	int age;	
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}



class Employee extends Person {
	int eid;
	double salary;
	
	Employee(String name,int age,int eid,double salary) {
		super(name,age);
		this.eid = eid;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(eid);
		System.out.println(salary);
	}
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Sanatan",20,19375,10000);
		e1.display();

	}

}
