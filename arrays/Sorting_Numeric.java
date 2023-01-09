package arrays;

import java.util.Arrays;

public class Sorting_Numeric {
	public static void main(String[] args) {
		int[] array= {9, 8, 5, 1, 7, 3};
		String[] str={"Shraddha", "Radhika", "Siddhi","Aradhya"};
			System.out.println("Orginal Array:"+Arrays.toString(array));
			Arrays.sort(array);
			System.out.println("Sorted Array: "+Arrays.toString(array));
			System.out.println("Orginal String of Array:"+Arrays.toString(str));
			Arrays.sort(str);
			System.out.println("Sorted String of Array: "+Arrays.toString(str));
			
			
		
	}

}
