package core.java.allconcept.oopsconcept;

public class ConstructorExample {
	
	int emp_id;
	String Name;
	float Salary;
	
	public ConstructorExample(int id,String name,float salary) {
		
		emp_id=id;
		Name=name;
		Salary= salary;
		
	}
	
	void dispay() {
		
		System.out.println(emp_id+" "+" "+ Name +" "+Salary);
	}

}
