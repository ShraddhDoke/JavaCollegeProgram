package Interface;

interface Person {
	void employee();

	public static final int emp_id = 400;

}

class Salary implements Person {
	@Override
	public void employee() {
		System.out.println("I am the employee of Infosys.");
		System.out.println(emp_id);

	}
}

public class Execute {
	public static void main(String[] args) {
		Salary e = new Salary();
		e.employee();

	}
}
