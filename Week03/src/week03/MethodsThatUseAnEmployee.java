package week03;

import javax.swing.JOptionPane;

public class MethodsThatUseAnEmployee {

	public static void main(String[] args) {
		
		Employee myEmployee;
		myEmployee = getEmployeeData();
		diplayEmployee(myEmployee);
		
		

	}
	public static Employee getEmployeeData() {
		Employee tempEmp = new Employee();
		String idStr;
		String salStr;
		int id;
		double sal;
		idStr = JOptionPane.showInputDialog(null, "Enter employee ID: ");
		id = Integer.parseInt(idStr);
		tempEmp.setEmpNum(id);
		salStr = JOptionPane.showInputDialog(null, "Enter employee salary: ");
		sal = Double.parseDouble(salStr);
		tempEmp.setEmpSalaray(sal);
		return tempEmp;
	}
	
	public static void diplayEmployee(Employee anEmp) {
		JOptionPane.showMessageDialog(null, "\nEmployee #" + anEmp.getEmpNum() + 
				". Salary is $" + anEmp.getEmpSalaray());
	}

}
