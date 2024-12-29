import java.util.Scanner;


public class CreateSpaServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String service;
//		double price;
		
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		
		firstService = getData(firstService);
		secondService = getData(secondService);
		
//		System.out.print("Enter service >> ");
//		service = keyboard.nextLine();
//		System.out.print("Enter price >> ");
//		price = keyboard.nextDouble();
//		
//		firstService.setServiceDescription(service);
//		firstService.setPrice(price);
		
//		keyboard.nextLine();
//		
//		System.out.print("Enter service >> ");
//		service = keyboard.nextLine();
//		System.out.print("Enter price >> ");
//		price = keyboard.nextDouble();
//		
//		secondService.setServiceDescription(service);
//		secondService.setPrice(price);
		
		
		System.out.println("First service details:");
		System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
		
		System.out.println("Second service details:");
		System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
		
		
	}
	
	public static SpaService getData(SpaService service) {
		
		SpaService tempService = new SpaService();
		String service1;
		double price;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter service >> ");
		service1 = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		
		tempService.setServiceDescription(service1);
		tempService.setPrice(price);
		return tempService;
		
	}

}
