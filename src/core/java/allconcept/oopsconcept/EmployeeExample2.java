package core.java.allconcept.oopsconcept;

public class EmployeeExample2 {

	int emp_id;
	String emp_name;
	float emp_salary;

	void getValue(int id, String name, float salary) {

		emp_id = id;
		emp_name = name;
		emp_salary = salary;

	}
	
	void display() {
		
		System.out.println(emp_id+" "+emp_name+" "+emp_salary);
		
	}

}
