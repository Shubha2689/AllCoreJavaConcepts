package core.java.allconcept.oopsconcept;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeExample ex = new EmployeeExample();
		ex.Employee_id = 1;
		ex.Employee_name = "Ankur";
		ex.Employee_salary = 30000.3f;
		
		ex.display();
		
		EmployeeExample ex1 = new EmployeeExample();
		ex1.Employee_id = 2;
		ex1.Employee_name = "shivanya";
		ex1.Employee_salary = 40000.3f;
		
		ex1.display();


	}

}
