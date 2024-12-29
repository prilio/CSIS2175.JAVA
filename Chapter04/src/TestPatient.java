/* Create an application that demonstrates
that each method works correctly*/

public class TestPatient {

	public static void main(String[] args) {

		Patient patient1 = new Patient();
		Patient patient2 = new Patient("A", '-', 2023, 38);

		System.out.println("Patient 01: ");
		System.out.println("ID number = " + patient1.getID());
		System.out.println("Blood type = " + patient1.getBlood()+patient1.getRhFactor());
		System.out.println("Age = " + patient1.getAge());
		System.out.println();
		System.out.println("Patient 02: ");
		System.out.println("ID number = " + patient2.getID());
		System.out.println("Blood type = " + patient2.getBlood()+patient2.getRhFactor());
		System.out.println("Age = " + patient2.getAge());
		
	}

}
