
public class CreatePolicies2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
		CarInsurancePolicy2 second = new CarInsurancePolicy2(456, 4);
		CarInsurancePolicy2 third = new CarInsurancePolicy2(789, 12, "NewCastle");
		
		first.display();
		second.display();
		third.display();
		
//		CarInsurancePolicy fourth = new CarInsurancePolicy();
		
	}

}
