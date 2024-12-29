/* Create a class named Lease with fields that hold an apartment tenant’s name,
apartment number, monthly rent amount, and term of the lease in months.
Include a constructor that initializes the name to “XXX”, the apartment
number to 0, the rent to 1000, and the term to 12. Also include methods to
get and set each of the fields. Include a nonstatic method named addPetFee()
that adds $10 to the monthly rent value and calls a static method named
explainPetPolicy() that explains the pet fee.*/

public class Lease {
	
	private String tenantName;
	private int aptNumber;
	private double monthlyRent;
	private int leaseTerm;
	
	
	public Lease() {
		tenantName = "XXX";
		aptNumber = 0;
		monthlyRent = 1000;
		leaseTerm = 12;
	}

	

	public Lease(String tenantName, int aptNumber, double monthlyRent, int leaseTerm) {
		this.tenantName = tenantName;
		this.aptNumber = aptNumber;
		this.monthlyRent = monthlyRent;
		this.leaseTerm = leaseTerm;
	}



	public String getTenantName() {
		return tenantName;
	}


	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}


	public int getAptNumber() {
		return aptNumber;
	}


	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}


	public double getMonthlyRent() {
		return monthlyRent;
	}


	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}


	public int getLeaseTerm() {
		return leaseTerm;
	}


	public void setLeaseTerm(int leaseTerm) {
		this.leaseTerm = leaseTerm;
	}
	
	
	public void addPetFee() {
				
		monthlyRent += 10;
		
		explainPetPolicy();
	}

	public static void explainPetPolicy() {
		
		System.out.println("If you a have a pet, it will be added $10.00 in your monthly rent.");
	}
}
