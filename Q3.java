import java.util.*;


class Students {
	int roll;
	String name;
	double dsa_mark;
	
	public void getData() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the name");
		name = sc.nextLine();
		
		
		System.out.println("Enter the roll number");
		roll = sc.nextInt();
		
		
		System.out.println("Enter the dsa mark");
		dsa_mark = sc.nextDouble();
	}
	
	
	public void display() {
		System.out.println(name);
		System.out.println(roll);
		System.out.println(dsa_mark);
		
	}
	
	
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1[] = new Students[5];
		double MaxMark = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i = 0; i < s1.length;i++) {
			s1[i] = new Students();
			s1[i].getData();
			s1[i].display();
			
			if(s1[i].dsa_mark > MaxMark) {
				MaxMark = s1[i].dsa_mark;
				index = i;
			}
		}
		System.out.println("student who have secure highest mark ");
		s1[index].display();
		
		

	}

}
