package core.java.allconcept;

public class Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//Arithmetic operators--> + - * / %
		
	System.out.println("Sum"+(a+b));
	System.out.println("Diff"+(a-b));
	System.out.println("Mul"+(a*b));
	System.out.println("Div"+(a/b));
	System.out.println("mod"+(a%b));
	
	//Relational operators (comparison operators)--> == <> <= >= !=
	
	System.out.println(a==b);
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	
	//-----logical operators----------&& || !
	
	//works between two boolean
	
	boolean x=true;
	boolean y= false;
	
	System.out.println(x && y);
	System.out.println(x || y);
	System.out.println(!x);
	System.out.println(!y);
	
	//-------------increment and decrement operators ++ --
	
	a=20;
	a++;	//a=a+1
	
	System.out.println(a);
	
	b=30;
	b--;  //b=b-1
	System.out.println(b);
	
	
	int s=10;
	int d=20;
	int c=s;
	
	//Swapping variable
	
	s=d;
	d=c;
	
	
	
 System.out.println(s+""+d);
	
	
	
	
	
	
	
	
		

	}

}
