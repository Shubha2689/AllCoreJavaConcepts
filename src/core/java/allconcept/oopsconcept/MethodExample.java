package core.java.allconcept.oopsconcept;

public class MethodExample {

	int a = 10;
	int b = 20;

	void sum() {
		System.out.println(a + b);//without return type
	}

	int sum1() {

		return (a + b);//with return type

	}

	void sum3(int a, int b) {
		
		System.out.println(a+b);//with parameter without return type
	}
	
	int sum4(int a ,int b) {
		
		return a+b;//with parameter with return type
	}

	public static void main(String[] args) {

		MethodExample me = new MethodExample();

		me.sum();
		System.out.println(me.sum1());
		
		me.sum3(10, 10);
		
		System.out.println(me.sum4(2, 7));
	}

}
