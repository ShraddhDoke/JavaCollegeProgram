package Interface;

interface AA {
	void show();

}

/*
 * class BB implements AA { public void show() { System.out.println("Hello"); }
 * }
 */

public class Demo3 {
	public static void main(String[] args) {
		AA obj = ()-> System.out.println("Hello Shraddha");
		obj.show();

	}
	

}
