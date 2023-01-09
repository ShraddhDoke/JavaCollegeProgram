package Polymorphism;

public class A {
	void add() {
		int x = 4, y = 10;
		int z = x + y;
		System.out.println(z);
	}

	void add(int a, int b) {
		int c;
		c = a + b;
		System.out.println(c);
	}

	void add(int p, double q) {
		double s;
		s = p + q;
		System.out.println(s);

	}

	public static void main(String[] args) {
		A obj = new A();
		obj.add();
		obj.add(3, 4);
		obj.add(9, 8.8);
	}
}
