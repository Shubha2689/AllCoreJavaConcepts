package core.java.allconcept.oopsconcept;

public class SimpleClassObjectEx {

	int student_id;
	String student_name;
	char student_div;

	void display() {
		System.out.println(student_id);
		System.out.println(student_name);
		System.out.println(student_div);

	}

	public static void main(String[] args) {
		
		SimpleClassObjectEx se= new SimpleClassObjectEx();
		se.student_id= 1;
		se.student_name = "shubhangi mali";
		se.student_div = 'A';
		se.display();

	}

}
