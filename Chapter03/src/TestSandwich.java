/*Create an application named TestSandwich that instantiates one Sandwich
object and demonstrates the use of the set and get methods.*/

public class TestSandwich {

	public static void main(String[] args) {


		Sandwich testSandwich = new Sandwich();
		String ingredient = "tuna";
		String bread = "wheat";
		double price = 4.99;

		
		testSandwich.setBreadName(bread);
		testSandwich.setMainIngredient(ingredient);
		testSandwich.setPrice(price);
		
		System.out.println("The " + testSandwich.getMainIngredient() + " sandwich with "
							+ testSandwich.getBreadName() + " bread, costs $"
							+ testSandwich.getPrice());

	}

}
