import javax.swing.JOptionPane;
public class AirlineDialog
{
   public static void main(String[] args)
   {
      int selection;
      
      boolean isYes;
      
      selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?"); 
      
      isYes = (selection == JOptionPane.YES_OPTION);
      JOptionPane.showMessageDialog(null, "You responded " + isYes);
      
      JOptionPane.showInputDialog(null, "What is your area code?", "Area code information",JOptionPane.QUESTION_MESSAGE);
      
      JOptionPane.showConfirmDialog(null, "A data input error has occurred. Continue?", "Data input error", 
    		  JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
      
      
      
      
   }
}
