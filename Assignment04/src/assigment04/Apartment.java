package assigment04;

//Apartment.java
public class Apartment {
 private String streetAddress;
 private String apartmentNumber;
 private int numberOfBedrooms;
 private double rent;

 public Apartment(String streetAddress, String apartmentNumber, int numberOfBedrooms, double rent) throws ApartmentException {
     if (apartmentNumber.length() != 3) {
         throw new ApartmentException("Apartment number must consist of three digits");
     }

     if (numberOfBedrooms < 1 || numberOfBedrooms > 4) {
         throw new ApartmentException("Number of bedrooms must be between 1 and 4");
     }

     if (rent < 500 || rent > 2500) {
         throw new ApartmentException("Rent must be between $500 and $2,500");
     }

     this.streetAddress = streetAddress;
     this.apartmentNumber = apartmentNumber;
     this.numberOfBedrooms = numberOfBedrooms;
     this.rent = rent;
     System.out.println("Apartment created successfully: " + this);
 }

 @Override
 public String toString() {
     return "Apartment{" +
             "streetAddress='" + streetAddress + '\'' +
             ", apartmentNumber='" + apartmentNumber + '\'' +
             ", numberOfBedrooms=" + numberOfBedrooms +
             ", rent=" + rent +
             '}';
 }
}

