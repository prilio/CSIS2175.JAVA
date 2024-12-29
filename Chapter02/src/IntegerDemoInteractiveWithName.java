import java.util.Scanner;

public class IntegerDemoInteractiveWithName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer >> ");
		anInt = input.nextInt();
		System.out.print("Please enter a byte integer >> ");
		aByte = input.nextByte();
		System.out.print("Please enter a short integer >> ");
		aShort = input.nextShort();
		System.out.print("Please enter a long integer >> ");
		aLong = input.nextLong();
		input.nextLine();
		System.out.print("Please enter your name >> ");
		name = input.nextLine();
		System.out.println("Thank you, " + name);
		
		int anotherInt = anInt * 10000000;
		
		System.out.println("Another int is " + anotherInt);
	}

}
