import java.util.Scanner;

public class GetInfo {

	public static void main(String[] args) {
	
		String name;
	      int age;
	      Scanner inputDevice = new Scanner(System.in);
	      
	      System.out.print("Please enter your name >> ");
	      name = inputDevice.nextLine();
	      
	      System.out.print("Please enter your age >> ");
	      age = inputDevice.nextInt();
	      
	      System.out.println("Your name is " + name + " and you are " + age + " years old.");
	      
	      
	      //Se for usar o Scanner e tiver uma variavel que guarde valor antes do String, deve-se usar o NextLine antes do String
	      String name1;
	      int age1;
	      Scanner inputDevice1 = new Scanner(System.in);
	      
	      System.out.print("Please enter your age >> ");
	      age1 = inputDevice1.nextInt();
	      
	      inputDevice1.nextLine();
	      
	      System.out.print("Please enter your name >> ");
	      name1 = inputDevice1.nextLine();
	      
	      System.out.println("Your name is " + name1 + " and you are " + age1 + " years old.");
	}

}
