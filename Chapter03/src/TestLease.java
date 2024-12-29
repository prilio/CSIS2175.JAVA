import java.util.Scanner;

/* Create a class named TestLease whose main() method declares four Lease
objects. Call a getData() method three times. Within the method, prompt a
user for values for each field for a Lease, and return a Lease object to the main()
method where it is assigned to one of main()’s Lease objects. Do not prompt the
user for values for the fourth Lease object, but let it continue to hold the default
values. Then, in main(), pass one of the Lease objects to a showValues() method
that displays the data. Then call the addPetFee() method using the passed Lease
object and confirm that the fee explanation statement is displayed. Next, call the
showValues() method for the Lease object again and confirm that the pet fee has
been added to the rent. Finally, call the showValues() method with each of the
other three objects; confirm that two hold the values you supplied as input and
one holds the constructor default values.*/

public class TestLease {

	public static void main(String[] args) {
		
		Lease lease1 = getData();
		Lease lease2 = getData();
		Lease lease3 = getData();
		Lease lease4 = new Lease();
		
		showValues(lease1);
		lease1.addPetFee();
		showValues(lease1);
		
		showValues(lease2);
		showValues(lease3);
		showValues(lease4);

				

	}
	
	public static Lease getData() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the tenant name >> ");
		String tenantName = input.nextLine();
		
		System.out.print("Enter the apartment number >> ");
		int aptNumber = input.nextInt();
		
		System.out.print("Enter the monthly rent value >> ");
		double monthlyRent = input.nextDouble();
		
		System.out.print("Enter the lease term >> ");
		int leaseTerm = input.nextInt();
		
		System.out.println();
		
		return new Lease(tenantName, aptNumber, monthlyRent, leaseTerm); 		
		
	}

	public static void showValues(Lease lease) {
		
		System.out.println("Tenant name: " + lease.getTenantName());
		System.out.println("Apartment number: " + lease.getAptNumber());
		System.out.println("Monthly rent amount: " + lease.getMonthlyRent());
		System.out.println("Lease term: " + lease.getLeaseTerm());
		System.out.println();
	}
}
