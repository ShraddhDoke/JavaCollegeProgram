package collection;

class MyGenericClass<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

public class Main {
	public static void main(String[] args) {
		MyGenericClass<Integer> m_int = new MyGenericClass<Integer>();
		m_int.add(2);
		MyGenericClass<String> m_str = new MyGenericClass<String>();
		m_str.add("Shraddha");
		MyGenericClass<Double> m_dd = new MyGenericClass<Double>();
		m_dd.add(2.8888);
		System.out.println("Members of generic class<Integer>"+m_int.get());
		System.out.println("Members of generic class<String>"+m_str.get());
		System.out.println("Members of generic class<Doublr>"+m_dd.get());

	}

}
