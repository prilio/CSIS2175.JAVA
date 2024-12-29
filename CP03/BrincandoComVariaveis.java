import javax.swing.JOptionPane;

public class BrincandoComVariaveis {

	public static void main(String[] args) {

		double x = 37.5;
		
		JOptionPane.showMessageDialog(null, "No main(), o valor de X: " + x);
		
		primeiroMetodo();
		
		JOptionPane.showMessageDialog(null, "Voltando para o main(), o valor de X: " + x);
		
		segundoMetodo(x);
		
		JOptionPane.showMessageDialog(null, "Voltando para o main() again, o valor de X: " + x);
		
		
	}
	
	public static void primeiroMetodo() {
		
		double x = 45.7;
		
		JOptionPane.showMessageDialog(null, "No primeiroMetodo(), o valor de X: " + x);
		
	}
	
	public static void segundoMetodo(double x) {
		JOptionPane.showMessageDialog(null, "No segundoMetodo(), o primeiro valor de X: " + x);
		
		x = 55.1;
		
		JOptionPane.showMessageDialog(null, "No segundoMetodo(), o segundo valor de X:" + x);
		
	}

}
