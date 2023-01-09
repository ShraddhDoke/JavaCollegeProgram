package LambdaExpression;
//Q1. Write a java program to execute Lambda Expression without parameter.
public class P1 {
	interface Hello {
		void hello();

	}

	public static void main(String[] args) {
		Hello obj = () -> System.out.println("Hello Shraddha Good Morning");
		obj.hello();
		
		
	}

}
