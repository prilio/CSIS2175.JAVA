package assignment02;


import javax.swing.JOptionPane;

public class IncomeCalculator {

	public static void main(String[] args) {
		
		
        // Prompt the user to input monthly net income with range check
        double monthlyIncome;
        
        do {
            monthlyIncome = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your monthly net income: "));
            if (monthlyIncome < 0 || monthlyIncome > 10000) {
            	JOptionPane.showMessageDialog(null, "Monthly income must be between 0 and 10,000.");
            }
        } while (monthlyIncome < 0 || monthlyIncome > 10000);

        // Define interest rates for different income groups and years
        double rateFirstYear, rateSecondYear, rateRestOfYears;
        
        if (monthlyIncome >= 5000) {
            rateFirstYear = 0.4;
            rateSecondYear = 0.5;
            rateRestOfYears = 0.6;
        } else if (monthlyIncome >= 3000) {
            rateFirstYear = 0.5;
            rateSecondYear = 0.6;
            rateRestOfYears = 0.7;
        } else {
            rateFirstYear = 0.6;
            rateSecondYear = 0.7;
            rateRestOfYears = 0.8;
        }

        // Calculate overall payments for the first, second, and rest of the years
        double paymentFirstYear = monthlyIncome * 12 * rateFirstYear;
        double paymentSecondYear = monthlyIncome * 12 * rateSecondYear;
        double paymentRestOfYears = monthlyIncome * 12 * rateRestOfYears;

        // Print the results
        JOptionPane.showMessageDialog(null,"Overall Payment for the First Year: $" + paymentFirstYear);
        JOptionPane.showMessageDialog(null,"Overall Payment for the Second Year: $" + paymentSecondYear);
        JOptionPane.showMessageDialog(null,"Overall Payment for the Rest of the Years: $" + paymentRestOfYears);

	}

}
