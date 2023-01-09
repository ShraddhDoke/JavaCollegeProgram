package collection;

public class GenericMethod {
	public static <T>void printGenericArray(T[] items) {
		for(T item : items) {
			System.out.print(item+"");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] int_Array= {1,2,4,5,6,11};
		Character[] char_Array = {'S','H','R','D','H','A'};
		System.out.println("Integer Array contents: ");
		printGenericArray(int_Array);
		System.out.println("Character Array contents: ");
		printGenericArray(char_Array );
	}

}
