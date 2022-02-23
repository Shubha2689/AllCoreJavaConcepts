package core.java.allconcept.interfaceex;

public class HybridInheritance extends Print implements A, B {

	public static void main(String[] args) {

		HybridInheritance hi = new HybridInheritance();
		hi.Display();// this print class from Display method

		hi.prinRecords();
		hi.showRecords();

	}

	@Override
	public void showRecords() 
	{

		System.out.println("This is showRecords method from  B interface");

	}

	@Override
	public void prinRecords() 
	{
		
		System.out.println("This is printRecords method from A interface");

	}

}
