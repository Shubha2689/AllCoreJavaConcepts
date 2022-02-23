package core.java.allconcept.oopsconcept;

class p{
	String s = "welcome";

	void dislay() {
		System.out.println(s);
	}
}

class q extends p {
	int a = 10;

	void print() {
		System.out.println(a);
	}
}

class r extends q {
	int a = 1;
	int b = 2;

	void add() {
		System.out.println(a + b);
	}

}

public class MultilevelEx {

	public static void main(String[] args) {

		r objR = new r();
		objR.dislay();
		objR.print();
		objR.add();

	}

}
