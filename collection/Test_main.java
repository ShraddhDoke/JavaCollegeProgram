package collection;
class Test_Generics<T1, T2>
{
	T1 obj1;
	T2 obj2;
	
	public Test_Generics(T1 obj1, T2 obj2) {
		this.obj1=obj1;
		this.obj2=obj2;
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println("T1 object: "+obj1);
		System.out.println("T2 object: "+obj2);
		
	}
}
public class Test_main {
	public static void main(String[] args) {
		Test_Generics<String,Integer> obj = new Test_Generics<String, Integer>("Shraddha",11);
		obj.print();
		
	}

}
