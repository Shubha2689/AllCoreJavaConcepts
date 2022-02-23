package core.java.allconcept.oopsconcept;

public class MethodOverloading {
	
	void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	
	void add(int a,String s) 
	{
		System.out.println(a+s);
		
	}
	
	void add(double a,int p) 
	{
		System.out.println(a+p);
	}

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		
		mo.add(1,3);
		mo.add(1,"shubhangi");
		mo.add(1.2, 3);
		

	}

}
