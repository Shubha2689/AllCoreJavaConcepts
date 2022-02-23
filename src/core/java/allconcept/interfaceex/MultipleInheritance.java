package core.java.allconcept.interfaceex;

public class MultipleInheritance implements abc, pqr {

	public static void main(String[] args) {

		MultipleInheritance mh = new MultipleInheritance();
		mh.m1();
		mh.m2();

	}

	@Override
	public void m1() {

		System.out.println(a);
	}

	@Override
	public void m2() {

		System.out.println(b);

	}

}
