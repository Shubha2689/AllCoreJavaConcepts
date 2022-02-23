package core.java.allconcept.interfaceex;

public class InterfaceTest implements InterfaceExample {
	
	
	@Override
	public void m1() 
	{
		System.out.println(a);
		
	}

	public static void main(String[] args) 
	{
		InterfaceTest test = new InterfaceTest();
		test.m1();
	}

	

}
