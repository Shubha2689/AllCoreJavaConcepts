package core.java.allconcept.oopsconcept;

class Bank {

	double rateOfInterest() 
	{
		return 0;
	}

}

class ICIC extends Bank
{
	double rateOfInterest() 
	{
		return 1.2;
	}

}

class AXIS extends Bank
{
	double rateOfInterest() 
	{
		return 1.5;
	}

}

public class MethodOverriding {

	public static void main(String[] args) {
		
		ICIC icic = new ICIC();
		System.out.println(icic.rateOfInterest());
		
		AXIS axis = new AXIS();
		System.out.println(axis.rateOfInterest());
		
		
		
		

	}

}
