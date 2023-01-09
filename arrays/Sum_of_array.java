package arrays;

public class Sum_of_array {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6 };
		int Sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			Sum += array[i];

		}
		System.out.println("\nSum of array: " + Sum);
	}

}
