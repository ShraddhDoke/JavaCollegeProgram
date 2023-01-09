package webexercise;

import java.util.Arrays;

public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * a[i];
		}
		System.out.println(Arrays.toString(a));
	}
}
