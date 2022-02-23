package core.java.allconcept.oopsconcept;

public class OverloadMethod {
	
	public void main(int a, int b)
	{
		System.out.println(a+b);
	}
	public void main(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) 
	{
		OverloadMethod om= new OverloadMethod();
		om.main(2, 3);
        om.main("shubhangi");
	}

}
