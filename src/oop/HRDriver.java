package oop;

public class HRDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HR hr = new HR();
		hr.hire(new Salaried("RajeevJha"));
		hr.hire(new Salaried("Sushma"));
		hr.hire(new Salaried());
		
		hr.printAllEmployees();
		hr.payAllEmployee();

	}

}
