/*Write an application that computes and displays the day on which you become
(or became) 10,000 days old.*/

import java.time.LocalDate;

public class TenThousandDaysOld {

	public static void main(String[] args) {
		
		LocalDate age = LocalDate.of(1984, 12, 19);
		
		int futureAge = 10000;
		
		System.out.println("The day on which I became 10,000 days old: " + age.plusDays(futureAge));

	}

}
