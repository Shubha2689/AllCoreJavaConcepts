package core.java.allconcept.oopsconcept;

class parant {
	int a;
	int b;

	void printAddition() {
		System.out.println("print result:-" + (a + b));
	}

	class child1 extends parant {
		int x;
		int y;

		void printMultiplication() {
			System.out.println("print result:" + (x) * (y));
		}

		class child2 extends parant {
			int p;
			int q;

			void printDivision() {
				System.out.println("print result:-" + p / q);// 
			}
		}
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {

	}

}
