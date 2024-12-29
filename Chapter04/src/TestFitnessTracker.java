import java.time.LocalDate;

/* Create an application that demonstrates each method works correctly. 
 * Create an additional overloaded constructor for the FitnessTracker class
you created in Exercise 3a. This constructor receives parameters for each of
the data fields and assigns them appropriately. Add any needed statements
to the TestFitnessTracker application to ensure that the overloaded
constructor works correctly, save it, and then test it.*/

public class TestFitnessTracker {

	public static void main(String[] args) {
		
		FitnessTracker ft1 = new FitnessTracker();
		FitnessTracker ft2 = new FitnessTracker("ciclying", 30, LocalDate.of(2023, 2, 28));
		
		System.out.println("FitnessTracker 01: ");
		System.out.println("Activity: " + ft1.getActivity());
		System.out.println("Time: " + ft1.getTimeParticipating());
		System.out.println("Actitity date: " + ft1.getDate());
		System.out.println();
		System.out.println("FitnessTracker 02: ");
		System.out.println("Activity: " + ft2.getActivity());
		System.out.println("Time: " + ft2.getTimeParticipating());
		System.out.println("Actitity date: " + ft2.getDate());
		
	}

}
