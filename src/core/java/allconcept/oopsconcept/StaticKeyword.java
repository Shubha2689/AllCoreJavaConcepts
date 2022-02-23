package core.java.allconcept.oopsconcept;

public class StaticKeyword {
	
	static int a;//static variable 
    int b;//non-static variable
	
	static void print() //static method 
	{
		System.out.println("welcome");
	}
	
	void print1() //non-static
	{
		System.out.println("Home");
	}

	public static void main(String[] args) {
		//static variable and method access by the class name
		System.out.println(StaticKeyword.a);//without creating object you can call
		
		StaticKeyword st =new StaticKeyword();
		System.out.println(st.b);//object creation
		
		StaticKeyword.print();//without creating object you can call method
		
		st.print1();//with object non static
		
		

	}

}
