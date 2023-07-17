import java.util.*;

abstract class Shape {
	abstract double calc_area();
}





class Square extends Shape{
	
	int side;
	Square() {
		System.out.println("Enter the side of square");
		Scanner sc = new Scanner(System.in);
	    side = sc.nextInt();
	}
	double calc_area() {
		return side*side;
	}
	
}



class Triangle extends Shape {
	int base;
	int height;
	Triangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the Triangle");
		base = sc.nextInt();
		System.out.println("Enter the height of the Triangle");
		height = sc.nextInt();
	}
	double calc_area() {
		return 0.5*base*height; 
	}
}




class Circle extends Shape {
	int radius;
	Circle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		radius = sc.nextInt();
	}
	double calc_area() {
		return Math.PI*radius*radius;
	}
}




public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square();
		Triangle t1 = new Triangle();
		Circle c1 = new Circle();
		
		System.out.println(s1.calc_area());
		System.out.println(t1.calc_area());
		System.out.println(c1.calc_area());
		

	}

}
