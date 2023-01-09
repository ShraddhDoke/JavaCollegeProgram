package Interface;
interface arathmatic{
	String name="root";
	public void circle();
	public void square();
	public void rectangle();
	
}
class ok implements arathmatic{
	public void circle() {
		int r=5;
		System.out.println("Area of Circle is "+3.14*r*r);
	}
	public void square() {
		int s=5;
		System.out.println("Area of Square is "+s*s);
	}
	public void rectangle() {
		int l=3;
		int b=6;
		System.out.println("Area of Rectangle is "+l*b);
		
	}
}

public class java {
	public static void main(String[] args) {
		var obj=new ok();
		obj.circle();
		obj.square();
		obj.rectangle();
	}

}
