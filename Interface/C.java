package Interface;
interface D {
	void welcome();
	void hello();

}
class A implements D
{
	 public void welcome()
	 {
		System.out.println("Welcome");
		
	}
	public void hello() {
			System.out.println("Hello");
		}
}
class B implements D{
	public void welcome()
	 {
		System.out.println("par");
		
	}
	public void hello() {
			System.out.println("Ho");
		}
}

class C {
	public static void main(String[] args) {
		var m=new A();
		m.hello();
		m.welcome();
		var n=new B();
		n.hello();
		n.welcome();
	}
}

