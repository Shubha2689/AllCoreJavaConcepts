package core.java.allconcept.oopsconcept;

// Single Inheritance one class extends other class

class A
{
	int a=1;
	void display()
	{
		System.out.println(a);
	}
	
}
class B extends A 
{
	int b=3;
	void print() 
	{
		System.out.println(b);
	}
	
}

   public class InheritanceExample {
	
	
    public static void main(String[] args) 
    {
    	B bobj= new B();
    	bobj.display();
    	bobj.print();
		
		
		
	}

}
