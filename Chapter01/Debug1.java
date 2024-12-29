import javax.swing.JOptionPane; 

public class Debug1 {

	public static void main(String[] args) {
	      System.out.println("My new and improved");
	      System.out.println("Java application");
	      JOptionPane.showMessageDialog(null, "First Java dialog");
	      
	      
	      //Debugs
	      System.out.println("Java programming is fun.");
	      System.out.println("Getting a program to work");
	      System.out.println("can be a challenge,");
	      System.out.println("but when everything works correctly,");
	      System.out.println("it's very satisfying");
	      
	      
	      System.out.println("Over the river");
	      System.out.println("and through the woods");
	      System.out.println("to Grandmother's house we go");
	      
	      System.out.print("This output ");
	      System.out.print("is on the same line as the last one.");
	      System.out.println("\nBut this is on a new ine.");
	      
	      
	      String block = 
	    	         """
	    	         Hello
	    	         there
	    	         """;
	    	      System.out.println(block);
	}

}