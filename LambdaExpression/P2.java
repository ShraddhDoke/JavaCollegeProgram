package LambdaExpression;
//Q2. Write a java program to execute Lambda Expression with single parameter.
interface Sayable {
	public String say(String name);

}

public class P2 {
	public static void main(String[] args) {
		Sayable S1 = (name) -> {
			return "Hello," + name;

		};
		System.out.println(S1.say("Shraddha"));
		Sayable S2 = (name) -> {
			return "Shraddha your " + name;
		};
		System.out.println(S2.say("Roll No is:11"));

	}
}