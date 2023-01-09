package LambdaExpression;
//Write a java program to execute Lambda Expression to perform arithmetic operations

interface Arithmetic_Operation {
	int Operation(int a, int b);
}

public class P5 {
	public static void main(String[] args) {
		Arithmetic_Operation add = (a, b) -> (a + b);
		System.out.println("Addition: "+add.Operation(50, 11));

		Arithmetic_Operation sub = (a, b) -> (a - b);
		System.out.println("Subtraction: "+sub.Operation(50, 11));

		Arithmetic_Operation mul = (a, b) -> (a * b);
		System.out.println("Multiplication: "+mul.Operation(50, 11));
		
		Arithmetic_Operation div = (a, b) -> (a * b);
		System.out.println("Division: "+div.Operation(50, 11));

	}

}
