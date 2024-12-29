package assigment04;
import java.util.Scanner;

public class ThrowApartmentException {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     Apartment[] apartments = new Apartment[10];

     for (int i = 0; i < apartments.length; i++) {
         try {
             System.out.println("Enter details for Apartment " + (i + 1));

             System.out.print("Street Address: ");
             String streetAddress = scanner.nextLine();

             System.out.print("Apartment Number: ");
             String apartmentNumber = scanner.nextLine();

             System.out.print("Number of Bedrooms: ");
             int numberOfBedrooms = scanner.nextInt();

             System.out.print("Rent: ");
             double rent = scanner.nextDouble();

             scanner.nextLine(); // Consume the newline left by nextDouble()

             apartments[i] = new Apartment(streetAddress, apartmentNumber, numberOfBedrooms, rent);
         } catch (ApartmentException e) {
             System.out.println("Error creating apartment: " + e.getMessage());
             // Consume the newline left in the scanner buffer to avoid skipping user input
             scanner.nextLine();
             i--; // Decrement i to repeat the input for the current index
         }
     }
     scanner.close();

     // Print details of all created apartments
     System.out.println("\nDetails of Created Apartments:");
     for (Apartment apartment : apartments) {
         if (apartment != null) {
             System.out.println(apartment);
         }
     }
 }
}
