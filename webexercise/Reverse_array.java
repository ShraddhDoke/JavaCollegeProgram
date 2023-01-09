package webexercise;
import java.util.Arrays;

public class Reverse_array {
	public static void main(String[] args) {
	int a[] = {1, 2, 3, 4, 5, 6};
	System.out.println("Original Array is: "+Arrays.toString(a));
	int n = a.length;
	for (int i = 0; i < n/2; i++) {
	    int temp = a[n-i-1];
	    a[n-i-1] = a[i];
	    a[i] = temp;
	}
	System.out.println("Reversed array is:"+Arrays.toString(a));
}
}

