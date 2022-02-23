package core.java.allconcept.oopsconcept;

public class ConstructorOverloading {
	
	public ConstructorOverloading(int a,int b) 
	{
        System.out.println(a+b);

	}
	public ConstructorOverloading(String s,int b) 
	{
       System.out.println(s+b);

	}
	public ConstructorOverloading(int d,int e,int a) 
	{
        System.out.println(d+e+a);

	}

	public static void main(String[] args) 
	{
		ConstructorOverloading co= new ConstructorOverloading(1, 2);
		
		ConstructorOverloading co1= new ConstructorOverloading("shubhangi", 2);
		
		ConstructorOverloading co2= new ConstructorOverloading(1,2,2);
		

	}

}
