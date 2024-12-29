/*Create an application named TestBloodData that demonstrates each method works
correctly.*/

public class TestBloodData {

	public static void main(String[] args) {

		BloodData testBlood1 = new BloodData();
		BloodData testBlood2 = new BloodData();
		
		testBlood2.setBlood("AB");
		testBlood2.setRhFactor('-');
		
		System.out.println("Testing blood 01: ");
		System.out.println("Blood type = " + testBlood1.getBlood()+testBlood1.getRhFactor());
		System.out.println();
		System.out.println("Testing blood 02: ");
		System.out.println("Blood type = " + testBlood2.getBlood()+testBlood2.getRhFactor());
		
		
	}

}
