import java.util.Scanner;

/*public class ControlStatemets {
	public static void main(String[] args) {
		int i, j;
		for(i=0;i<6;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
	}

}
*/
/*
 * public class ControlStatemets { public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter Your First No: "); int i = sc.nextInt();
 * //System.out.println("First Variable is:" + i);
 * System.out.print("Enter Your Second No: "); int j = sc.nextInt();
 * //1System.out.println("Second Variable is:" + j); if (i == j) {
 * System.out.println("Both variables are same."); } else { if (i > j) {
 * System.out.println("i is greater than j."); } else {
 * System.out.println("j is greater than i."); }
 * 
 * } } }
 */
public class ControlStatemets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your value you want: "); 
		int i = sc.nextInt();
		switch (i) {
		case 1: {
			
			System.out.println("Monday");
			break;
		}
		case 2: {
			
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			
			System.out.println("Thuresday");
			break;
		}
		case 5: {
			
			System.out.println("Friday");
			break;
		}
		case 6: {
			
			System.out.println("Saturday");
			break;
		}
		case 7: {
			
			System.out.println("Sunday");
			break;
		}
		
		}
	}
}
