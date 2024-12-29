public class CompanyInfo
{
   
	public static void main(String[] args)
   {
      System.out.println("Smart Electronics");
      displayHours();
      
      
      double hours = 25;
      double yourHoursWorked = 37.5;
      
      calculateGross(10);
      calculateGross(hours);
      calculateGross(yourHoursWorked);
   }
   
   public static void displayHours()
   {
      System.out.println("Monday - Friday 8 am to 6 pm");
      System.out.println("Saturday        8 am to noon");
      System.out.println("Sunday          closed");
   }
   
   public static void calculateGross(double hours)
   {
      final double STD_RATE = 22.75;
      double gross;
      gross = hours * STD_RATE;
      System.out.println(hours + " hours at $" + STD_RATE + " per hour is $" + gross);
   }
}
