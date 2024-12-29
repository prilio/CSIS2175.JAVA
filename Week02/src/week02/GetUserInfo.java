package week02;

import java.util.Scanner;

public class GetUserInfo {

	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name >> ");
		name = input.nextLine();
		System.out.print("Please enter your age >> ");
		age = input.nextInt();
		System.out.println("Your name is " + name + " and you are " + age + " years old.");

	}

}
