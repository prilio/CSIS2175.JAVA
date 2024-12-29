package assignment03;

class Student {
	
    private String firstName;
    private String lastName;
    private double tuition;

    public Student(String firstName, String lastName, double tuition) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.tuition = tuition;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getTuition() {
		return tuition;
	}


	public void setTuition(double tuition) {
		this.tuition = tuition;
	}

	@Override
    public String toString() {
        return firstName + " " + lastName +  " - Tuition: $" + tuition;
    }
}




