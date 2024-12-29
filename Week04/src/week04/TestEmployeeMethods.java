package week04;

public class TestEmployeeMethods {

	public static void main(String[] args) {

		Employee worker = new Employee();
		worker.setValues();
		worker.methodThatUsesInstanceAttributes();
		worker.methodThatUsesLocalVariables();

	}

}
