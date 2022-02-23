package core.java.allconcept.oopsconcept;

public class ThisKeayword {
	
	int a;
	int b;
	
	void add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void printValue() 
	{
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		
		ThisKeayword th = new ThisKeayword();
		th.add(1, 3);
		th.printValue();
		
		

	}

}
