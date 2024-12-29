import java.time.LocalDate;
import java.time.Month;

/* The LocalDate class includes an instance method named lengthOfMonth() that
returns the number of days in the month. Write an application that uses methods
in the LocalDate class to calculate how many days are left until the first day of
next month. Display the result, including the name of the next month.*/

public class DaysTilNextMonth {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		int daysUntilNextMonth = today.lengthOfMonth() - today.getDayOfMonth();
		LocalDate nextMonth = today.plusMonths(1);
		Month nextMonthName = nextMonth.getMonth();
		System.out.printf("There are " + daysUntilNextMonth + " days until " + nextMonthName);
	}
}

