import java.time.LocalDate;

/*Write a program that declares two LocalDate objects and assign values that
represent January 31 and December 31 in the current year. Display output that
demonstrates the dates displayed when one, two, and three months are added to
each of the objects.*/


public class TestMonthHandling {

	public static void main(String[] args) {

		LocalDate value = LocalDate.of(LocalDate.now().getYear(), 1, 31);
		LocalDate value2 = LocalDate.of(LocalDate.now().getYear(), 12, 31);
	
		System.out.println("Add 1 month: " + value.plusMonths(1) + " and " + value2.plusMonths(1));
		System.out.println("Add 2 months: " + value.plusMonths(2) + " and " + value2.plusMonths(2));
		System.out.println("Add 3 months: " + value.plusMonths(3) + " and " + value2.plusMonths(3));
		

	}

}
