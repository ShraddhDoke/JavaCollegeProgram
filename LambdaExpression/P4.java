package LambdaExpression;

//Q4. Write a java program to execute functional interface with anonymous class.
// Write a java program to execute Lambda Expression with return value.
interface function11 {
	double value(double pi);

}

public class P4 {
	public static void main(String[] args) {
		function11 ob = (pi) -> {
			return 3.14;

		};

		System.out.println(ob.value(0));

	}

}
